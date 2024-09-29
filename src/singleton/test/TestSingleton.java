package singleton.test;

import singleton.model.Singleton;
public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.someBusinessLogic();

        //criando um "novo" objeto singleton
        Singleton singleton2 = Singleton.getInstance();

        if(singleton == singleton2) System.out.println("Singleton is equals a Singleton!");    
    }
}
