public class ConfigurationDirector {
    public void constructSSHDevice(DeviceBuilder builder) {
        builder.reset();
        builder.setDeviceId("Device001");
        builder.setIpAddress("192.168.1.10");
        builder.setProtocol("SSH");
        builder.setPort(22);
        builder.setEncryption("AES-256");
        builder.enableMonitoring(true);
    }

    public void constructHTTPDevice(DeviceBuilder builder) {
        builder.reset();
        builder.setDeviceId("Device002");
        builder.setIpAddress("192.168.1.20");
        builder.setProtocol("HTTP");
        builder.setPort(80);
        builder.setEncryption("None");
        builder.enableMonitoring(false);
    }
}
