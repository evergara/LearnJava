package poo.basico;

import java.util.Arrays;

public class Pais {
    private String nombre;
    private String bandera;
    private String iso;
    private Continente continente;
    private String lenguaje;
    private Integer poblacion;
    private Ciudad[] cuidades;
    private Ciudad capital;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    public Ciudad[] getCuidades() {
        return cuidades;
    }

    public void setCuidades(Ciudad[] cuidades) {
        this.cuidades = cuidades;
    }

    public Ciudad getCapital() {
        return capital;
    }

    public void setCapital(Ciudad capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", bandera='" + bandera + '\'' +
                ", iso='" + iso + '\'' +
                ", continente=" + continente +
                ", lenguaje='" + lenguaje + '\'' +
                ", poblacion=" + poblacion +
                ", cuidades=" + Arrays.toString(cuidades) +
                ", capital=" + capital +
                '}';
    }
}
