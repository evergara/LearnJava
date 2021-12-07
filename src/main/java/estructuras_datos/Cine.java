package estructuras_datos;

import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        boolean[][] filas = new boolean[4][6];
        String iconReserva = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reserve butaca, ingrese fila: ");
        int fila = scanner.nextInt();
        System.out.println("Ingrese butaca: ");
        int butaca = scanner.nextInt();
        filas[fila][butaca] = true;

        for (int i = 0; i < filas.length; i++) {
            System.out.println("_________________________________");
            for (int j = 0; j < filas[i].length; j++) {
                iconReserva = filas[i][j] ?  "X" : "" ;
                System.out.print("[ "+ iconReserva +" ]");
            }
            System.out.println("");
        }
       scanner.close();
    }
}
