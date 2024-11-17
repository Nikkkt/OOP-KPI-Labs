public class NetworkConfigurationManager {
    public void applyConfiguration(DeviceConfiguration config) {
        System.out.println("Applying configuration to device:");
        System.out.println(config);
        System.out.println("Configuration applied successfully\n");
    }

    public void monitorDevice(String deviceId) {
        System.out.println("Starting monitoring for device: " + deviceId);
        System.out.println("Monitoring...\n");
    }
}