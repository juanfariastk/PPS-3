package visitor.model;

public class ConcreteElementA implements Element {

    public ConcreteElementA() {
    }

    //permite que um visitante entre no objetol (explicação apra uso do this)
    public void accept(Visitor v) {
        v.visitConcreteElement(this);
    }

    public String operationA() {
        return "ConcreteElementA operationA()";
    }
}
