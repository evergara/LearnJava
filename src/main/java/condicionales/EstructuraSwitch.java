package condicionales;

import java.util.Arrays;
import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Bienvenido al sistema");
        System.out.println("1. ABM Usuarios");
        System.out.println("2. ABM Cliente");
        System.out.println("3. ABM Operaciones");
        System.out.println("4. Salir");
        System.out.println("------------------------------------");
        System.out.println("Ingrese una opcion ");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Bienvenido a ABM usuarios");
                break;
            case 2:
                System.out.println("Bienvenido a ABM cliente");
                break;
            case 3:
                System.out.println("Bienvenido a ABM operaciones");
                break;
            case 4:
                System.out.println("Salienoo del programa");
                break;
            default:
                System.out.println("Ha ngresado una opcion no valida");
        }


        sc.close();
    }
}
