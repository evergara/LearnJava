package estructuras_datos;

public class Arreglos {
    public static void main(String[] args) {
        //Declara arreglos
        int[] edades = new int[8];

        //Carga de datos

        edades[0] = 24;
        edades[1] = 34;
        edades[2] = 14;
        edades[3] = 44;
        edades[4] = 88;
        edades[5] = 82;
        edades[6] = 62;
        edades[7] = 25;

        System.out.println("Dimension del array: " + edades.length);

        //Recorrido para mostrrlo
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad " + edades[i]);
        }

        //Acceder a una posicion especifica
        int laCuartaEdad = edades[3];
        System.out.println("La cuarta persona tiene " + laCuartaEdad + " años");

        //Saber quien es el menor
        int menor = 10000;
        int mayor = -10000;
        double promedio = 0;
        for (int edad:edades){
           if(edad < menor){
               menor = edad;
           }
           if (edad> mayor){
               mayor = edad;
           }
           promedio += edad;
        }

        promedio /= edades.length;

        System.out.println("El menos es " + menor + " el mayor es " + mayor + ", el promedio de edades es "
        + promedio);
    }
}
