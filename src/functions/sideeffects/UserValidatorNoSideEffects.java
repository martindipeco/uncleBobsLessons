package functions.sideeffects;

import functions.sideeffects.auxiliar.Cryptographer;
import functions.sideeffects.auxiliar.Session;
import functions.sideeffects.auxiliar.User;
import functions.sideeffects.auxiliar.UserGateway;

public class UserValidatorNoSideEffects {
    private Cryptographer cryptographer;
    public boolean checkPassword(String userName, String password) {
        User user = UserGateway.findByName(userName);
        if (user != User.NULL) {
            String codedPhrase = user.getPhraseEncodedByPassword();
            String phrase = cryptographer.decrypt(codedPhrase, password);
            if ("Valid Password".equals(phrase)) {
                return true;
            }
        }
        return false;
    }

    //iniciar sesión desde main
    //        UserValidatorNoSideEffects userValidatorNoSideEffects = new UserValidatorNoSideEffects();
    //        if (userValidatorNoSideEffects.checkPassword("user", "pass")) {
    //            Session.initialize();
    //        }
}
