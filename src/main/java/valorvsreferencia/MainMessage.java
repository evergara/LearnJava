package valorvsreferencia;

public class MainMessage {
    public static void main(String[] args) {
        ImmutableMessage message = new ImmutableMessage("Aprendiendo como loco");

        System.out.println(UtilidadGeneral.getInstance().getMessage(message));
        System.out.println(message.getMessage());
    }
}
