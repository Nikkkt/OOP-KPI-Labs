public class NetworkDeviceBuilder implements DeviceBuilder {
    private DeviceConfiguration device;

    public NetworkDeviceBuilder() { reset(); }

    @Override
    public void reset() { device = new DeviceConfiguration(); }

    @Override
    public void setDeviceId(String deviceId) { device.setDeviceId(deviceId); }

    @Override
    public void setIpAddress(String ipAddress) { device.setIpAddress(ipAddress); }

    @Override
    public void setProtocol(String protocol) { device.setProtocol(protocol); }

    @Override
    public void setPort(int port) { device.setPort(port); }

    @Override
    public void setEncryption(String encryption) { device.setEncryption(encryption); }

    @Override
    public void enableMonitoring(boolean enabled) { device.setMonitoringEnabled(enabled); }

    public DeviceConfiguration getResult() { return device; }
}
