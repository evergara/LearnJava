package operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        OperadoresRelacionales operador =new OperadoresRelacionales();
        operador.primitivoNumerico();
        operador.primitivoBoolean();
    }

    private void primitivoNumerico() {
        int i = 3;
        int j = 7;
        int p= 7;
        float k = 127e-7f;
        double l =  2.1417e3;

        System.out.println(" i = " + i +" j = " + j + " k = " + k +" l = " + l);
        System.out.println("i == j " + (i == j));
        System.out.println("k == k " + (k == k));
        System.out.println("k == l " + (k == l));

        System.out.println("k > l " + (k > l));
        System.out.println("k < l " + (k < l));

        System.out.println("k <= l " + (k <= l));
        System.out.println("k >= l " + (k >= l));
        System.out.println("j >= p " + (j >= p));
    }

    private void primitivoBoolean() {
        boolean isTrue =  true;
        boolean isFalse=  false;
        System.out.println("isFalse = " + isFalse + ", isTrue = " + isTrue);
        System.out.println("isFalse == isTrue :" + (isFalse == isTrue));
        System.out.println("!isFalse == isTrue :" + (!isFalse == isTrue));
        System.out.println("isFalse == !sTrue :" + (isFalse == !isTrue));
    }

}
