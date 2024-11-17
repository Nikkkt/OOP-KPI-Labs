public class DeviceConfiguration {
    private String deviceId;
    private String ipAddress;
    private String protocol;
    private int port;
    private String encryption;
    private boolean monitoringEnabled;

    public void setDeviceId(String deviceId) { this.deviceId = deviceId; }
    public void setIpAddress(String ipAddress) { this.ipAddress = ipAddress; }
    public void setProtocol(String protocol) { this.protocol = protocol; }
    public void setPort(int port) { this.port = port; }
    public void setEncryption(String encryption) { this.encryption = encryption; }
    public void setMonitoringEnabled(boolean monitoringEnabled) { this.monitoringEnabled = monitoringEnabled; }

    public String getDeviceId() { return deviceId; }
    public String getIpAddress() { return ipAddress; }
    public String getProtocol() { return protocol; }
    public int getPort() { return port; }
    public String getEncryption() { return encryption; }
    public boolean isMonitoringEnabled() { return monitoringEnabled; }

    @Override
    public String toString() {
        return "{\n" +
                "  \"deviceId\": \"" + deviceId + "\",\n" +
                "  \"ipAddress\": \"" + ipAddress + "\",\n" +
                "  \"protocol\": \"" + protocol + "\",\n" +
                "  \"port\": " + port + ",\n" +
                "  \"encryption\": \"" + encryption + "\",\n" +
                "  \"monitoringEnabled\": " + monitoringEnabled + "\n" +
                "}";
    }
}