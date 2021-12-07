package interaccion_usuario;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad");

        int edad = sc.nextInt();

        if(edad > 17){
            System.out.println("Bienvenido a la disco!!!");
        } else if(edad >= 15 && edad <=17){
            System.out.println("Ustede puede acceder a la matine");
        } else {
            System.out.println("Lamentablemente usted no puede acceder a la discoteca");
        }

        sc.close();
    }
}
