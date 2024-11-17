import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NetworkConfigurationManagerTest {
    @Test
    void testApplyConfiguration() {
        NetworkDeviceBuilder builder = new NetworkDeviceBuilder();
        builder.setDeviceId("TestDevice001");
        builder.setIpAddress("10.0.0.1");
        builder.setProtocol("SSH");
        builder.setPort(22);
        builder.setEncryption("AES-256");
        builder.enableMonitoring(true);
        DeviceConfiguration config = builder.getResult();

        NetworkConfigurationManager manager = new NetworkConfigurationManager();

        manager.applyConfiguration(config);

        assertNotNull(config);
    }

    @Test
    void testMonitorDevice() {
        NetworkConfigurationManager manager = new NetworkConfigurationManager();

        String deviceId = "TestDevice001";

        assertDoesNotThrow(() -> manager.monitorDevice(deviceId));
    }
}
