package chainofresponsability.model;

public abstract class AbstractHandler implements Handler{

    private Handler nextHandler;

    public Handler setNext(Handler hand){
        this.nextHandler = hand;
        return hand;
    }
    
    public void handle(String request){
        if(this.nextHandler != null){
            this.nextHandler.handle(request);
        }
    }
}
