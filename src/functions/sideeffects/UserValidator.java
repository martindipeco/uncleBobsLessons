//Taken from "Clean Code" by Robert C. Martin
//Listing 3-6

package functions.sideeffects;

import functions.sideeffects.auxiliar.Cryptographer;
import functions.sideeffects.auxiliar.Session;
import functions.sideeffects.auxiliar.User;
import functions.sideeffects.auxiliar.UserGateway;

//initializes session as a side effect
public class UserValidator {
    private Cryptographer cryptographer;
    public boolean checkPassword(String userName, String password) {
        User user = UserGateway.findByName(userName);
        if (user != User.NULL) {
            String codedPhrase = user.getPhraseEncodedByPassword();
            String phrase = cryptographer.decrypt(codedPhrase, password);
            if ("Valid Password".equals(phrase)) {
                Session.initialize();
                return true;
            }
        }
        return false;
    }
}
