package patroneesdedisenos.singleton;

/**
 * Patron Singleton, que lo que hace es crear un unico objeto en todo sistema
 */
public final  class Singleton {
    //Actributo privado
    private static Singleton instance;

    //Constructor privado
    private Singleton(){}

    //La magia ocurre en este metodo
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public void operacion(Singleton objIntance){
        if (objIntance == instance){
            System.out.println("Somos el mismo objeto");
        }else {
            System.out.println("Jumm, algo va mal no somos el mismo objetos");
        }
    }
    public void operacion2(Singleton objIntance, Singleton objIntance2){
        if (objIntance == objIntance2){
            System.out.println("Somos dos objetos pero somos el mismo objeto");
        }else {
            System.out.println("huy, Jumm , algo va mal no somos el mismo objetos");
        }
    }
}
