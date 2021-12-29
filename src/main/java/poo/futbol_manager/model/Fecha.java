package poo.futbol_manager.model;

import java.util.ArrayList;

public class Fecha {
    private int numero;
    private boolean  fechaFifa;
    private ArrayList<Partido> partidos;

    public void addPartido(Partido partido){
        if(partidos == null)
            partidos = new ArrayList<>();

        partidos.add(partido);
    }
}
