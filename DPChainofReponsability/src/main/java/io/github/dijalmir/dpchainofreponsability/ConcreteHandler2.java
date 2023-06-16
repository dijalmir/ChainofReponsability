package io.github.dijalmir.dpchainofreponsability;

public class ConcreteHandler2 extends AbstractHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("Tipo2")) {
            System.out.println("ConcreteHandler2 lida com a solicitação: " + request.getDescription());
        } else {
            super.handleRequest(request);
        }
    }
}