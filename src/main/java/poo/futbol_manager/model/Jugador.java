package poo.futbol_manager.model;

public class Jugador {
    private String nombre;
    private int dorsal;
    private boolean isCapitan;
    private String lesionado;
    private int cabeza;
    private int entrdas;
    private int regate;
    private float promedio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public boolean isCapitan() {
        return isCapitan;
    }

    public void setCapitan(boolean capitan) {
        isCapitan = capitan;
    }

    public String getLesionado() {
        return lesionado;
    }

    public void setLesionado(String lesionado) {
        this.lesionado = lesionado;
    }

    public int getCabeza() {
        return cabeza;
    }

    public void setCabeza(int cabeza) {
        this.cabeza = cabeza;
    }

    public int getEntrdas() {
        return entrdas;
    }

    public void setEntrdas(int entrdas) {
        this.entrdas = entrdas;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        this.regate = regate;
    }

    public float getPromedio() {
        return promedio;
    }
}
