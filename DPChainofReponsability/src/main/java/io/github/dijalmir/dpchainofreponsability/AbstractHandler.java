package io.github.dijalmir.dpchainofreponsability;

public abstract class AbstractHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }
}