package estructuras_datos;

import java.util.Locale;
import java.util.Scanner;

public class ArreglosInicializados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] selecionEsp = new String[]{"Iker","Puyol","Ramos", "Iniesta", "Villa"};

        System.out.println("Seleccion campeona de España sudafrica 2010");

        for (String nombreJugador: selecionEsp ) {
            System.out.println("nombreJugador = " + nombreJugador);
        }
        System.out.println("Ingrese nombre del jugador");
        String search = sc.nextLine();

        for (String nombreJugador: selecionEsp) {
            if(nombreJugador.equalsIgnoreCase(search)){
                System.out.println("Epa, jugador encontrado: "+  nombreJugador + " !!!");
            }
        }

        for (String nombreJugador: selecionEsp) {
            if(nombreJugador.toLowerCase().contains(search.toLowerCase())){
                System.out.println("Epa, jugador encontrado: "+  nombreJugador + " !!!");
            }
        }

    }
}
