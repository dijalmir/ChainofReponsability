package io.github.dijalmir.dpchainofreponsability;

public interface Handler {
    void setNext(Handler next);
    void handleRequest(Request request);
}