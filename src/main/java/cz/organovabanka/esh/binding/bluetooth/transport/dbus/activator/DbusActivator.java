package cz.organovabanka.esh.binding.bluetooth.transport.dbus.activator;

import org.osgi.framework.BundleContext;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import cz.organovabanka.bluetooth.manager.transport.dbus.BluezFactory;

import org.sputnikdev.bluetooth.manager.transport.BluetoothObjectFactory;

@Component(immediate = true, name = "binding.bluetooth.transport.dbus.activator")
public class DbusActivator {
    private BluezFactory bluezFactory;

    public DbusActivator() {
        ;
    }

    @Activate
    public void activate(BundleContext context) {
        bluezFactory = new BluezFactory();
        context.registerService(BluetoothObjectFactory.class.getName(), bluezFactory, null);
    }

    @Deactivate
    public void deactivate(BundleContext context) {
        if (bluezFactory != null) {
            bluezFactory.dispose();
            bluezFactory = null;
        }
    }

}
