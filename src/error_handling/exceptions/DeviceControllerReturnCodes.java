package error_handling.exceptions;

import error_handling.exceptions.auxiliar.DeviceHandle;
import error_handling.exceptions.auxiliar.Record;
import error_handling.exceptions.auxiliar.Logger;

import static error_handling.exceptions.auxiliar.Status.DEVICE_SUSPENDED;

public class DeviceControllerReturnCodes {
    private static final Object DEV1 = "Device 1";
    private Record record;
    private Logger logger;

    public void sendShutDown() {
        DeviceHandle handle = getHandle(DEV1);
        //Check the state of the device
        if (handle != DeviceHandle.INVALID) {
            //save the device status to the record field
            retrieveDeviceRecord(handle);
            //if not suspended, shut down
            if (record.getStatus() != DEVICE_SUSPENDED) {
                pauseDevice(handle);
                clearDeviceWorkQueue(handle);
                closeDevice(handle);
            } else {
                logger.log("Device suspended. Unable to shut down");
            }
        } else {
            logger.log("Invalid handle for " + DEV1.toString());
        }
    }

    private DeviceHandle getHandle(Object dev1) {
        return new DeviceHandle(1);
    }

    private void retrieveDeviceRecord(DeviceHandle handle) {
    }

    private void pauseDevice(DeviceHandle handle) {
    }

    private void clearDeviceWorkQueue(DeviceHandle handle) {
    }

    private void closeDevice(DeviceHandle handle) {
    }
}
