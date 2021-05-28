package operadores;

public class OperadoresLogicos {

   public static void main(String[] args) {
        start();
    }

    private static void start() {
        OperadoresLogicos operador =new OperadoresLogicos();
        operador.primitivoNumerico();
        operador.precenciaEsplicita();
    }

    private void precenciaEsplicita() {
        System.out.println("===============Precedencia de operadores ========================");
        System.out.println("true || true && false : " + (true || true && false));
        System.out.println("false || false && true : " + (false || false && true));
        System.out.println("true || false && true : " + (true || false && true));
        System.out.println("true || false && false : " + (true || false && false));
        System.out.println("false || true && false : " + (false || true && false));
        System.out.println("false || true && false : " + ((false || true) && false));
        System.out.println("false && false : " + (false && false));
        System.out.println("true && false : " + (true && false));
        System.out.println("false && true : " + ( false && true));
    }

    private void primitivoNumerico() {
        int i = 3;
        int j = 7;
        int p= 7;
        float k = 127e-7f;
        double l =  2.1417e3;

        System.out.println(" i = " + i +" j = " + j + " k = " + k +" l = " + l);
        System.out.println("i == j  && k == k " + ((i == j) && (k == k)));
        System.out.println("p == j  && k == k " + ((p == j) && (k == k)));
        System.out.println("=================================");
        System.out.println("i == j || p == j " + (i == j || p == j));
        System.out.println("k == j || l == j " + (k == j || l == j));
    }


}
