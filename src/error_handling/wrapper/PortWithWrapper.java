package error_handling.wrapper;

import error_handling.wrapper.auxiliar.LocalPort;
import error_handling.wrapper.auxiliar.Logger;
import error_handling.wrapper.auxiliar.PortDeviceFailure;

public class PortWithWrapper {
    LocalPort port = new LocalPort(12);
    Logger logger = new Logger();

    public void libraryCall() {
        try {
            port.open();
        } catch (PortDeviceFailure e) {
            reportError(e);
            logger.log(e.getMessage(), e);
        } finally {
            System.out.println("Process completed");
        }
    }

    private void reportError(Throwable e) {
    }
}
