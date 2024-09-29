package chainofresponsability.model;

public interface Handler {
    Handler setNext(Handler handler);
    void handle(String request);
}
