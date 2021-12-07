package interaccion_usuario;

import java.util.Scanner;

public class inputUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String datoDelUsuario = scanner.nextLine();
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        boolean esMayorDeEdad = edad > 18;

        System.out.println("Hola  " + datoDelUsuario + ". usted tiene " + edad  +" años, eres mayor de edad " + esMayorDeEdad);
        scanner.close();
    }
}
