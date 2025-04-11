package error_handling.tests.unclebob.auxiliar;

public class StorageException extends RuntimeException {
    public StorageException(String retrievalError, Exception e) {
    }
}
