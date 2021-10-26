package patroneesdedisenos.singleton;

public class SingletonMultiHilo {
    private static SingletonMultiHilo instance;
    public String value;

    private SingletonMultiHilo(String value) {
        this.value = value;
    }

    public  SingletonMultiHilo getInstance(String value){
        SingletonMultiHilo result = instance;

        if (result != null) {
            return result;
        }
        synchronized(SingletonMultiHilo.class) {
            if (instance == null) {
                instance = new SingletonMultiHilo(value);
            }
            return instance;
        }
    }
}
