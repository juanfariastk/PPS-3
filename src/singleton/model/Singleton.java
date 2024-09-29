package singleton.model;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
            return instance;
        }else{
            return instance;
        }
    }

    public void someBusinessLogic(){
        System.out.println("Some business logic method called!");
    }
}
