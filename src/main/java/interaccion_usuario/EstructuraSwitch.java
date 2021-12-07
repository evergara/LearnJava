package interaccion_usuario;

import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al sistema");
        System.out.println("1. ABM Usuario");
        System.out.println("2. ABM Clientes");
        System.out.println("3. ABM Operaciones");
        System.out.println("4. Salir");
        System.out.println("___________________________________________________________________");
        System.out.println("Ingrese una opcion");

        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Quieres modificar usuarios");
                break;
            case 2:
                System.out.println("Quieres modificar clientes");
                break;
            case 3:
                System.out.println("Quieres modificar operaciones");
                break;
            case 4:
                System.out.println("Saliendo del sistema....");
                break;
            default:
                System.out.println("Has digitado una opcion no validad");
        }

        sc.close();
    }
}
