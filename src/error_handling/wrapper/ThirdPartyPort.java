package error_handling.wrapper;

import error_handling.wrapper.auxiliar.*;

public class ThirdPartyPort {
    ACMEPort port = new ACMEPort(12);
    Logger logger = new Logger();

    public void libraryCall() {
        try {
            port.open();
        } catch (DeviceResponseException e) {
            reportPortError(e);
            logger.log("Device response exception", e);
        } catch (ATM1212UnlockedException e) {
            reportPortError(e);
            logger.log("Unlock exception", e);
        } catch (GMXError e) {
            reportPortError(e);
            logger.log("GMX Device response exception", e);
        } finally {
            System.out.println("Process completed");
        }
    }

    private void reportPortError(Throwable e) {
    }

}
