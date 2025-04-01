package error_handling.wrapper.auxiliar;

import java.util.Random;

public class ACMEPort {
    public ACMEPort(int i) {
    }

    public void open() throws DeviceResponseException, ATM1212UnlockedException, GMXError {
        double number = Math.random();
        if(number < 10) {
            throw new DeviceResponseException();
        } else if (number > 10) {
            throw new ATM1212UnlockedException();
        }
        else {
            throw new GMXError();
        }
    }
}
