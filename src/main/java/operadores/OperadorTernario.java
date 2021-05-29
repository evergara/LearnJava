package operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        OperadorTernario operadorTernario = new OperadorTernario();
        operadorTernario.fundamento();
        operadorTernario.numeroMayor();
    }

    private void numeroMayor() {
       int max = 0;
       Integer[] numeros = new Integer[3];
        Scanner sc = new Scanner(System.in);

        int band = 0;
        do {
            System.out.println("Digite un numero");
            numeros[band] = sc.nextInt();
            band++;
        }while (band < numeros.length);

        max = (numeros[0] > numeros[1])? numeros[0] : numeros[1];
        max = (max > numeros[2])? max : numeros[2];


        System.out.println("numero 1 = " + numeros[0]);
        System.out.println("numero 2 = " + numeros[1]);
        System.out.println("numero 3 = " + numeros[2]);
        System.out.println("El numero mayor es = " + max);
    }

    private void fundamento() {
        String amigo = 7 ==  7 ? "Si es amigo":"No es amigo";
        System.out.println("amigo = " + amigo);

        String estado = null;
        double promedio = 4.5;

        estado = promedio >= 4.0 ? "Aprovado" : "Reprobado";
        System.out.println("estado = " + estado);
        promedio = 3.9;
        estado = promedio >=4.0 ? "Aprovado" : "Reprobado";
        System.out.println("estado = " + estado);
    }
}
