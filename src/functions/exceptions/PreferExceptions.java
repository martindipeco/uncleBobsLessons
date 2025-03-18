package functions.exceptions;

//if you use exceptions instead of returned error codes,
// the error processing code can be separated from the happy path code and can be simplified

import functions.exceptions.auxiliar.*;

import java.lang.module.Configuration;

import static functions.exceptions.auxiliar.ErrorEnum.E_ERROR;
import static functions.exceptions.auxiliar.ErrorEnum.E_OK;

public class PreferExceptions {
    //added atributes not present in original function
    private Page page;
    private Registro registry;
    private Configuracion configKeys;
    private Diario logger;

    public void betterTryCatch() {
        try {
            deletePage(page);
            registry.deleteReference(page.name);
            configKeys.deleteKey(page.name.makeKey());
        }
        catch (Exception e) {
            logger.log(e.getMessage());
        }
    }

    //added function not present in original script
    private void deletePage(Page page) {
    }
}
