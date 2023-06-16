package io.github.dijalmir.dpchainofreponsability;

public class ConcreteHandler1 extends AbstractHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("Tipo1")) {
            System.out.println("ConcreteHandler1 lida com a solicitação: " + request.getDescription());
        } else {
            super.handleRequest(request);
        }
    }
}
