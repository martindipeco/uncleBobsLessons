package functions.exceptions;

//if you use exceptions instead of returned error codes,
// the error processing code can be separated from the happy path code and can be simplified

import functions.exceptions.auxiliar.Configuracion;
import functions.exceptions.auxiliar.Diario;
import functions.exceptions.auxiliar.Page;
import functions.exceptions.auxiliar.Registro;

import java.lang.module.Configuration;

public class PreferExceptions {
//    try {
//        deletePage(page);
//        registry.deleteReference(page.name);
//        configKeys.deleteKey(page.name.makeKey());
//    }
//    catch (Exception e) {
//            logger.log(e.getMessage());

    // try catch blocks confuse the structure of the code and
    //mix error processing with normal processing. So it is better to extract the bodies of the try
    //and catch blocks out into functions of their own.

    Registro registry = new Registro();
    Configuracion configKeys = new Configuracion();
    Diario logger = new Diario();

    public void delete(Page page) {
        try {
            deletePageAndAllReferences(page);
        }
        catch (Exception e) {
            logError(e);
        }
    }
    private void deletePageAndAllReferences(Page page) throws Exception {
        deletePage(page);
        registry.deleteReference(page.name);
        configKeys.deleteKey(page.name.makeKey());
    }

    private void deletePage(Page page) {
    }

    private void logError(Exception e) {
        logger.log(e.getMessage());
    }

}
