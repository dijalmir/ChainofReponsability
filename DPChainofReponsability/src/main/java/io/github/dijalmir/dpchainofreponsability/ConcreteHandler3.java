
package io.github.dijalmir.dpchainofreponsability;

/**
 *
 * @author junio
 */
public class ConcreteHandler3 extends AbstractHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("Tipo3")) {
            System.out.println("ConcreteHandler3 lida com a solicitação: " + request.getDescription());
        } else {
            super.handleRequest(request);
        }
    }
}