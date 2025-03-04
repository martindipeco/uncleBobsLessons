package functions.separation;

public class CommandQuerySeparation {
    //Functions should either do something or answer something, but not both
    //This function sets the value of a named attribute and returns true if it is successful and
    //false if no such attribute exists
    public boolean set(String attribute, String value) {
        return false;
    }
    //Should be avoided. leads to odd statements like "if (set("username", "unclebob"))..."
    //What does it mean? Is it asking whether
    //the “username” attribute was previously set to “unclebob”? Or is it asking whether the
    //“username” attribute was successfully set to “unclebob”?

    //RIGHT WAY:
    public boolean attributeExists(String username) {
        //if (username not in db) -> return false
        return true;
    }

    public void setAttribute(String attribute, String value) {

    }

    //instanciar Clase desde main e invocar metodos
    //if (instanciaDeClase.attributeExists("username")) {
    //instanciaDeClase.setAttribute("username", "unclebob");
    //...
    //}

}
