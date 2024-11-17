import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NetworkDeviceBuilderTest {
    @Test
    void testDeviceConfigurationBuilder() {
        NetworkDeviceBuilder builder = new NetworkDeviceBuilder();

        builder.setDeviceId("TestDevice001");
        builder.setIpAddress("10.0.0.1");
        builder.setProtocol("SSH");
        builder.setPort(22);
        builder.setEncryption("AES-256");
        builder.enableMonitoring(true);
        DeviceConfiguration config = builder.getResult();

        assertTrue(config.toString().contains("TestDevice001"));
        assertTrue(config.toString().contains("10.0.0.1"));
        assertTrue(config.toString().contains("SSH"));
        assertTrue(config.toString().contains("22"));
        assertTrue(config.toString().contains("AES-256"));
        assertTrue(config.toString().contains("true"));
    }

    @Test
    void testResetMethod() {
        NetworkDeviceBuilder builder = new NetworkDeviceBuilder();

        builder.setDeviceId("TestDevice001");
        builder.setIpAddress("10.0.0.1");
        builder.setProtocol("SSH");
        builder.reset();
        DeviceConfiguration config = builder.getResult();

        assertNull(config.getDeviceId());
        assertNull(config.getIpAddress());
        assertNull(config.getProtocol());
        assertEquals(0, config.getPort());
        assertNull(config.getEncryption());
        assertFalse(config.isMonitoringEnabled());
    }
}
