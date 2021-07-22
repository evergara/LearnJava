package poo.relaciones_entre_clases.dependencia;

public class principal {
    public static void main(String[] args) {
     Ecuacion ecuacion = new Ecuacion(2, 3, 6);

        System.out.println("El resultado es: " + ecuacion.resolver());

    }
}
