package estructuras_datos;

public class Enumeradores {
    public static void main(String[] args) {
      Estaciones[] estaciones = Estaciones.values();

        for (Estaciones estacion: estaciones ) {
            if(estacion == Estaciones.VERANO){
                System.out.println("Es Verano");
            }
            System.out.println("Estacion = " + estacion);
        }
    }
}
