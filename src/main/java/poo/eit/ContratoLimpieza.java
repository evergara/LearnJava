package poo.eit;

public class ContratoLimpieza {
    private String empresa;
    private int year;
    private Intervalo[] jornadas;
    private Intervalo jornadaBase = new Intervalo(8,12);
    private final double PRECIO_HORA_ESTANDAR = 10;
    private final double PRECIO_HORA_EXTRA = 12;

    public ContratoLimpieza(String empresa, int year){
        this.empresa = empresa;
        this.year = year;
        jornadas = new Intervalo[Fecha.diasYear(year)];
        for(int i=0; i<Fecha.diasYear(year); i++){
            jornadas[i] = jornadaBase.clonar();
        }
    }

    private Intervalo getJornada(Fecha fecha){
        return jornadas[fecha.diaYear()-1];
    }

    private void setJornada(Fecha fecha, Intervalo intervalo){
        jornadas[fecha.diaYear()-1] = intervalo;
    }

    public void anular(Fecha fecha){
        this.setJornada(fecha, null);
    }

    public void doblar(Fecha fecha){
        this.getJornada(fecha).doblar();
    }

    public void desplazar(Fecha fecha, int desplazamiento){
        this.getJornada(fecha).desplazar(desplazamiento);
    }

    public void mostrar(){
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("EMPRESA: "+empresa);
        Fecha fecha = new Fecha(1,1, year);
        for(int i = 0; i<Fecha.diasYear(year); i++){
            if (this.getJornada(fecha)!=null){
                fecha.mostrar();
                this.getJornada(fecha).mostrar();
            }
            fecha.incrementar(1);
        }
    }

    public double coste(){
        double resultado = 0;
        Fecha fecha = new Fecha(1,1, year);
        for(int i = 0; i<Fecha.diasYear(year); i++){
            if (this.getJornada(fecha)!=null){
                double horasEstandar = this.getJornada(fecha).interseccion(jornadaBase).longitud();
                double horasExtras = this.getJornada(fecha).longitud() - horasEstandar;
                resultado += PRECIO_HORA_ESTANDAR * horasEstandar + PRECIO_HORA_EXTRA * horasExtras;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {

    }
}
