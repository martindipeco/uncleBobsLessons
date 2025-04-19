package unit_tests.auxiliar;

public class SerializedPageResponder implements Responder{
    @Override
    public Response makeResponse(FitNesseContext context, Request request) {
        return new SimpleResponse();
    }
}
