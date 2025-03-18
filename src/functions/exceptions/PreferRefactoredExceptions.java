package functions.exceptions;

import functions.exceptions.auxiliar.Configuracion;
import functions.exceptions.auxiliar.Diario;
import functions.exceptions.auxiliar.Page;
import functions.exceptions.auxiliar.Registro;

// try catch blocks confuse the structure of the code and mix error processing with normal processing.
// It is better to extract the bodies of the try and catch blocks out into functions of their own.
public class PreferRefactoredExceptions {
    //added attributes not present in original function
    private Registro registry;
    private Configuracion configKeys;
    private Diario logger;

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

    private void logError(Exception e) {
        logger.log(e.getMessage());
    }

    //added method not present in original
    private void deletePage(Page page) {
    }
}
