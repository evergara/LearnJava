package operadores;

public class OperadorUnario {
    public static void main(String[] args) {
        start();
    }

    private static void start(){
        OperadorUnario operador = new OperadorUnario();
        operador.unarioPositivo();
        operador.unarioNegativo();

    }

    private void unarioPositivo() {
        int i = -5;
        int j = 4;

        System.out.println("i = "+ i +"," +" j = " + j);
        j = +i;
        System.out.println("j = " + j);
    }

    private void unarioNegativo() {
        int i = -5;
        int j = 4;

        System.out.println("i = "+ i +"," +" j = " + j);
        j = -i;
        System.out.println("j = " + j);
    }

}
