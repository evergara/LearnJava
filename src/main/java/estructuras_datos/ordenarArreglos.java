package estructuras_datos;

import oca.oracle.introduction.Array;

import java.util.Arrays;

public class ordenarArreglos {
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

        for (int i = 0; i < edades.length ; i++) {
            for (int j = 0; j < edades.length; j++) {
                if (edades[i]>edades[j]) {
                    //Intercambio
                    int aux = edades[i];
                    edades[i] = edades[j];
                    edades[j] = aux;
                }
            }
        }

        //mostrar
        for (int edad:edades ) {
            System.out.println("edad = " + edad);
        }
        System.out.println("________________________________________________________");
        Arrays.sort(edades);
        //mostrar
        for (int edad:edades ) {
            System.out.println("edad = " + edad);
        }
    }
}
