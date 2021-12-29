package poo.futbol_manager.model;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String escudo;
    private String fundacion;
    private String color;
    private ArrayList<Jugador> jugadores;
    private DT dt;

    public void addJugador(Jugador jugador){
        if(jugadores == null)
            jugadores = new ArrayList<>();

        jugadores.add(jugador);
    }
}
