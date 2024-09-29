package chainofresponsability.model;

public class ConcreteHandlerA extends AbstractHandler {

    @Override
    public void handle(String request){
        if(request.equals("type A")){
            System.out.println("Resquest of type a is handled by ConcreteHandlerA");
        }else{
            super.handle(request);
        }
    }
}
