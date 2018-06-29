# eclipse-smarthome-bluetooth-binding-dbus-transport
Plugin for OpenHab, providing bluetooth transport implemented in [bluetooth-manager-dbus](https://github.com/xrucka/bluetooth-manager-dbus).

## Prerequisites
1. bluetooth-manager-dbus
2. maven

## Setup
In OpenHab Karaf console, run
`
bundle:install file:///path/to/jarfile
`
(replace /path/to/jarfile with absolute path to your build)

---
## Contribution

### Building

Then build the project with maven:
```bash
mvn clean install
```
