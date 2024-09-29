package chainofresponsability.test;

import chainofresponsability.model.ConcreteHandlerA;
import chainofresponsability.model.ConcreteHandlerB;

public class TestHandler {
    public static void main(String[] args) {
        ConcreteHandlerA handlerA = new ConcreteHandlerA();
        ConcreteHandlerB handlerB = new ConcreteHandlerB();

        handlerA.setNext(handlerB);

        String request = "type B";

        handlerA.handle(request);
    }
}
