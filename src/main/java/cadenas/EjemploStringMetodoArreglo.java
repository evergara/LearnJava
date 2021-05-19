package cadenas;

public class EjemploStringMetodoArreglo {
    public static void main(String[] args) {
        String miPalabra = "murcielago";
        System.out.println("miPalabra.toCharArray() = "+miPalabra.toCharArray());

        char[] arreglo = miPalabra.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Recorriendo el arregle: index = " + i + " valor: "+ arreglo[i] );
        }
    }
}
