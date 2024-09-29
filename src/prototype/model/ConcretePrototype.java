package prototype.model;

public class ConcretePrototype implements Prototype {

    private String attributeA;

    public ConcretePrototype(String aA) {
        this.attributeA = aA;
    }
    
    public void setAttributeA(String attributeA) {
        this.attributeA = attributeA;
    }

    public String getAttributeA() {
        return attributeA;
    }

    @Override
    public ConcretePrototype clone(){
        return new ConcretePrototype(this.attributeA); // posso colocar vários this a dependender de quantos argumentos vai no construtor
    }
}
