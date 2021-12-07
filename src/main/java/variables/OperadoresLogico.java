package variables;

public class OperadoresLogico {
    public static void main(String[] args) {
        boolean tengoDinero = true;
        boolean juegaMiEquipoFavorito = true;
        boolean esLindoDia = true;
        
        boolean asistirAPartido = (tengoDinero && esLindoDia) || juegaMiEquipoFavorito;

        System.out.println("asistirAPartido = " + asistirAPartido);

    }
}
