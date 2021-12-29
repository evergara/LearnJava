package poo.basico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Continente continente[] = Continente.values();
        Ciudad capital = new Ciudad();
        Pais pais = new Pais();

        System.out.println("Ingrese nombre del pais");
        pais.setNombre(sc.nextLine());
        System.out.println("Ingrese bandera del pais");
        pais.setBandera(sc.nextLine());
        System.out.println("Ingrese cantidad de poblacion del pais");
        pais.setPoblacion(sc.nextInt());
        System.out.println("Ingrese idioma del pais");
        pais.setLenguaje(sc.nextLine());
        System.out.println("Ingrese continente del pais");

        for (int i = 0; i < continente.length; i++) {
            System.out.println("Ingrese " + i +" Para " + continente[i] );
        }
        pais.setContinente(Continente.valueOf(continente[sc.nextInt()].toString()));
        
        System.out.println("Ingrese Capital del pais");
        System.out.println("Ingrese el nombre de la capital pais");
        capital.setNombre(sc.nextLine());
        System.out.println("Ingrese el patrono de la capital pais");
        capital.setPatrono(sc.nextLine());
        System.out.println("Ingrese el presupuesto de la capital pais");
        capital.setPresupuesto(sc.nextDouble());

        pais.setCapital(capital);

        System.out.println("pais = " + pais);
        sc.close();
    }
}
