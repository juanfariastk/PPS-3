package decorator.test;

import decorator.model.Component;
import decorator.model.ConcreteComponent;
import decorator.model.ConcreteDecoratorA;
import decorator.model.Decorator;
public class TestDecorator {
 public static void main(String[] args) {
        Component componente1 = new ConcreteComponent();
        componente1.operation();

        // uso do decorator para nova funcionalidade (passando o componente concreto)
        Decorator componente2 = new ConcreteDecoratorA(componente1);
        componente2.operation();
 }
}
