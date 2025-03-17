package functions.exceptions;

//When you return an error code, you create the problem that the caller must deal with the error immediately
import functions.exceptions.auxiliar.*;

import static functions.exceptions.auxiliar.ErrorEnum.E_ERROR;
import static functions.exceptions.auxiliar.ErrorEnum.E_OK;

public class ReturningErrorCodes {
    //added atributes not present in original example
    private Page page;
    private Registro registry;
    private Configuracion configKeys;
    private Diario logger;

    public ErrorEnum returnCode() {
        if (deletePage(page) == E_OK) {
            if (registry.deleteReference(page.name) == E_OK) {
                if (configKeys.deleteKey(page.name.makeKey()) == E_OK){
                    logger.log("page deleted");
                } else {
                    logger.log("configKey not deleted");
                }
            } else {
                logger.log("deleteReference from registry failed");
            }
        } else {
            logger.log("delete failed");
            return E_ERROR;
        }
        //added line not present in original example
        return E_OK;
    }

    //added function not present in original script
    public ErrorEnum deletePage(Page page) {
        if(page.name.makeKey() == "page") {
            return E_OK;
        }
        return E_ERROR;
    }
}
