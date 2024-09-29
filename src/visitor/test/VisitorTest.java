package visitor.test;

import visitor.model.ConcreteElementA;
import visitor.model.ConcreteVisitor;
import visitor.model.Element;
import visitor.model.ObjectEstructure;
import visitor.model.Visitor;

public class VisitorTest {
    public static void main(String[] args) {
       ObjectEstructure objectEstructure = new ObjectEstructure();
        Element elementA = new ConcreteElementA();
        objectEstructure.addElement(elementA);

        Visitor visitor = new ConcreteVisitor();
        objectEstructure.accept(visitor);
        
    }
}
