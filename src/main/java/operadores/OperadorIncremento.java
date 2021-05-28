package operadores;

public class OperadorIncremento {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        OperadorIncremento operador =new OperadorIncremento();
        operador.incrementarPost();
        operador.incrementarPre();
    }

    private void incrementarPost() {
        int i = 5;
        int j = 4;
        System.out.println("===========Post Incrementa ++Variable======================================");
        System.out.println("Nace: i = "+ i +"," +" j = " + j);
        System.out.println("Incrementa: i = "+ i++ +"," +" j = " + j++);
        System.out.println("Meustra: i = "+ i +"," +" j = " + j);

    }

    private void incrementarPre() {
        int i = 5;
        int j = 4;
        System.out.println("===========Pre Incrementa Variable++======================================");
        System.out.println("Nace: i = "+ i +"," +" j = " + j);
        System.out.println("Incrementa: i = "+ ++i +"," +" j = " + ++j);
        System.out.println("Meustra: i = "+ i +"," +" j = " + j);
    }
}
