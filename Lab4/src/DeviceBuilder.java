public interface DeviceBuilder {
    void reset();

    void setDeviceId(String deviceId);

    void setIpAddress(String ipAddress);

    void setProtocol(String protocol);

    void setPort(int port);

    void setEncryption(String encryption);

    void enableMonitoring(boolean enabled);
}
