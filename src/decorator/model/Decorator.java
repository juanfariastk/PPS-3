package decorator.model;

public class Decorator {

    private Component componente;

    public Decorator(Component comp){
        this.componente = comp;
    }

    public void operation(){
        this.componente.operation();
    }
}
