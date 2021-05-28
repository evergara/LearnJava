package operadores;

public class OperadorAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;

        System.out.println("i = "+ i +"," +" j = " + j);
        i +=2; //  i = i + 2;
        System.out.println("i = "+ i);
        i -=1;  // i = i - 1;
        System.out.println("i = "+ i);
        i *=2;  // i = i * 2;
        System.out.println("i = "+ i);
        i /=2;  // i = i / 2;
        System.out.println("i = "+ i);
        i %=5;  // i = i % 5;
        System.out.println("i = "+ i);
    }
}
