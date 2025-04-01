package error_handling.wrapper.auxiliar;

public class LocalPort {
    private ACMEPort innerPort;

    public LocalPort(int portNumber) {
        innerPort = new ACMEPort(portNumber);
    }

    public void open() throws PortDeviceFailure {
        try {
            innerPort.open();
        } catch (DeviceResponseException | ATM1212UnlockedException | GMXError e) {
            throw new PortDeviceFailure();
        }
    }
}
