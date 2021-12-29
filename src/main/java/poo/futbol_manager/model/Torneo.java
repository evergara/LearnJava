package poo.futbol_manager.model;

import java.util.ArrayList;

public class Torneo {
    private String nombre;
    private String descripcion;
    private boolean isNacional;
    private ArrayList<Fecha> fechas;

    public void addFechas(Fecha fecha) {
        if(fechas == null)
            fechas = new ArrayList<>();

        fechas.add(fecha);
    }
}
