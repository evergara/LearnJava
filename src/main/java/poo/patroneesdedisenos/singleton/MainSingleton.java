package poo.patroneesdedisenos.singleton;


public class MainSingleton {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();

        singleton.operacion(anotherSingleton);
        anotherSingleton.operacion(singleton);
        singleton.operacion2(singleton,anotherSingleton);

    }
}
