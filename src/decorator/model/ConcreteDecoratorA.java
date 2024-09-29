package decorator.model;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component componente){
        super(componente);
    }

    public void operation(){
        super.operation();
        System.out.println("Concrete decorator operation method is now used!");
    }
}
