package prototype.test;

import prototype.model.ConcretePrototype;

public class TestPrototype {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Value A");

        ConcretePrototype clone = prototype.clone();
        System.out.println("Attribute A in clone: " + clone.getAttributeA());

        clone.setAttributeA("Value B");
        System.out.println("Attribute A in clone after changes: " + clone.getAttributeA());

        System.out.println("Attribute A in prototype: " + prototype.getAttributeA());
    }
}
