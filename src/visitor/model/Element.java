package visitor.model;

public interface Element {
    void accept(Visitor v);
}
