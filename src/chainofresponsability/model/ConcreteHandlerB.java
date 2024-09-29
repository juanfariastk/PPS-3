package chainofresponsability.model;

public class ConcreteHandlerB extends AbstractHandler {

    @Override 
    public void handle(String request){
        if(request.equals("type B")){
            System.out.println("Request of type b is handled by ConcreteHandlerB");
        }else{
            super.handle(request);
        }
    }
}
