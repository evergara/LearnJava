package valorvsreferencia;

public final class UtilidadGeneral {

    private static final UtilidadGeneral instance = new UtilidadGeneral();


    private UtilidadGeneral(){}

    public static UtilidadGeneral getInstance(){
        return instance;
    }

    public String getMessage(ImmutableMessage message){
        return message.getMessage();
    }
}
