package error_handling.exceptions;

import error_handling.exceptions.auxiliar.*;

public class DeviceControllerExceptions {
    private static final DeviceID DEV1 = new DeviceID();
    private Logger logger;

    public void sendShutDown() {
        try {
            tryToShutDown();
        } catch (DeviceShutDownError e) {
            logger.log(e);
        }
    }

    private void tryToShutDown() throws DeviceShutDownError {
        DeviceHandle handle = getHandle(DEV1);
        DeviceRecord record = retrieveDeviceRecord(handle);
        pauseDevice(handle);
        clearDeviceWorkQueue(handle);
        closeDevice(handle);
    }


    private DeviceHandle getHandle(DeviceID id) throws DeviceShutDownError {
        if (id.equals(0)) {
            throw new DeviceShutDownError("Invalid handle for: " + id.toString());
        }
        return new DeviceHandle(1);
    }

    private DeviceRecord retrieveDeviceRecord(DeviceHandle handle) {
        return new DeviceRecord();
    }

    private void pauseDevice(DeviceHandle handle) {
    }

    private void clearDeviceWorkQueue(DeviceHandle handle) {
    }

    private void closeDevice(DeviceHandle handle) {
    }
}
