package decorator.model;

public class ConcreteComponent implements Component {
    
    @Override
    public void operation() {
        System.out.println("ConcreteComponent operation is now used!");
    }

}
