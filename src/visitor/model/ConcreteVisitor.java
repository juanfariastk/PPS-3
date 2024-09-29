package visitor.model;

public class ConcreteVisitor implements Visitor {

    public ConcreteVisitor() {
    }

    // usa o método da classe que está visitando e realiza uma ação antes                                 
    public void visitConcreteElement(ConcreteElementA ce) {
        System.out.println("ConcreteVisitor visiting ConcreteElementA" + ce.operationA());
    }

}
