package visitor.model;

import java.util.ArrayList;
import java.util.List;

public class ObjectEstructure {
    private List<Element> elements;

    public ObjectEstructure() {
        elements = new ArrayList<>();
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    // passa o visitante para dentro do objeto
    public void accept(Visitor v) {
        for (Element element : elements) {
            element.accept(v);
        }
    }
    
}
