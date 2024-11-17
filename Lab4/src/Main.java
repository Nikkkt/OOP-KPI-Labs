public class Main {
    public static void main(String[] args) {
        ConfigurationDirector director = new ConfigurationDirector();
        NetworkConfigurationManager manager = new NetworkConfigurationManager();

        NetworkDeviceBuilder sshBuilder = new NetworkDeviceBuilder();
        director.constructSSHDevice(sshBuilder);
        DeviceConfiguration sshDevice = sshBuilder.getResult();
        manager.applyConfiguration(sshDevice);
        manager.monitorDevice(sshDevice.toString());

        NetworkDeviceBuilder httpBuilder = new NetworkDeviceBuilder();
        director.constructHTTPDevice(httpBuilder);
        DeviceConfiguration httpDevice = httpBuilder.getResult();
        manager.applyConfiguration(httpDevice);
    }
}
