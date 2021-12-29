package poo.basico;

public class Ciudad {
    private String nombre;
    private String patrono;
    private double presupuesto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatrono() {
        return patrono;
    }

    public void setPatrono(String patrono) {
        this.patrono = patrono;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", patrono='" + patrono + '\'' +
                ", presupuesto=" + presupuesto +
                '}';
    }
}
