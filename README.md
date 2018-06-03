# eclipse-smarthome-bluetooth-binding-dbus-transport
Plugin for OpenHab, providing bluetooth transport implemented in [bluetooth-manager-dbus](https://github.com/xrucka/bluetooth-manager-dbus).

## Prerequisites

As I'm not that familiar with maven, there are manual changes required on ouput jarfiles.

---
## Contribution

### Building

Then build the project with maven:
```bash
mvn clean install
```

Then, add your dbus-java.jar, hexdump.jar and unix.jar (the latter two are dependencies of the first one) to the lib subdirectory of the jarfile.
Furthermore, you need to update the MANIFEST.MF as follows:
```
Bundle-ClassPath: .,lib/bluetooth-manager-dbus-1.0-SNAPSHOT.jar,lib/db
 us.jar,lib/hexdump.jar,lib/unix.jar
Import-Package: org.osgi.framework,org.slf4j,org.sputnikdev.bluetooth,
 org.sputnikdev.bluetooth.manager,org.sputnikdev.bluetooth.manager.tra
 nsport
```
