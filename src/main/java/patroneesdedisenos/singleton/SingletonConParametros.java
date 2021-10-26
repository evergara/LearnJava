package patroneesdedisenos.singleton;

public final class SingletonConParametros {
    private static SingletonConParametros instance;
    public String value;

    private SingletonConParametros(String value) {
        this.value = value;
    }

    public  SingletonConParametros getInstance(String value){
        if(instance == null){
            instance = new SingletonConParametros(value);
        }
        return instance;
    }
}
