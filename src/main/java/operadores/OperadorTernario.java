package operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        String amigo = 7 ==  7 ? "Si es amigo":"No es amigo";
        System.out.println("amigo = " + amigo);

        String estado = null;
        double promedio = 4.5;

        estado = promedio >= 4.0 ? "Aprovado" : "Reprobado";
        System.out.println("estado = " + estado);
        promedio = 3.9;
        estado = promedio >=4.0 ? "Aprovado" : "Reprobado";
        System.out.println("estado = " + estado);
    }
}
