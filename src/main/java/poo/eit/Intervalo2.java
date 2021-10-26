package poo.eit;

public class Intervalo2 {
    //DEFINICIÓN DE ATRIBUTOS
    private double superior;
    private double inferior;

    //Constructores
    public Intervalo2(){
        this(0.0, 0.0);
    }

    public Intervalo2(double superior){
        this(0.0, superior);
    }

    public Intervalo2(double inferior, double superior){
        assert inferior <= superior;

        this.superior = superior;
        this.inferior = inferior;
    }

    public Intervalo2(Intervalo2 intervalo){
       this(intervalo.inferior, intervalo.superior);
    }

    //Metodos privados



    //Metodos publico
    public double longitud(){
        return  this.superior - this.inferior;
    }

    public void desplazar(double desplazamiento){
        this.superior += desplazamiento;
        this.inferior += desplazamiento;
    }

    public Intervalo2 clonar(){
        return new Intervalo2(this);
    }

    public Intervalo2 desplazado(double desplazamiento){
        //return new Intervalo2(this.superior+desplazamiento,this.inferior + desplazamiento);
        Intervalo2 intervalo = this.clonar();
        intervalo.desplazar(desplazamiento);
        return intervalo;
    }

    public boolean incluye(double punto){
        //return Math.abs(punto - this.puntoMedio()) < this.longitud()/2;
        return this.inferior <= punto && punto<=this.superior;
    }

    public boolean incluye(Intervalo2 intervalo){
        assert intervalo != null;

        //return this.inferior <= intervalo.inferior && intervalo.superior<=this.superior;
        return this.incluye(intervalo.inferior) && this.incluye(intervalo.superior);
    }

    public boolean igual(Intervalo2 intervalo){
        assert intervalo != null;

        return this.superior == intervalo.superior && this.inferior == this.inferior;
    }

    public boolean elMismo(Intervalo2 intervalo){
        return this == intervalo;
    }

    public Intervalo2 interseccion(Intervalo2 intervalo){
        assert this.intersecta(intervalo);

        if(this.intersecta(intervalo)){
            return intervalo.clonar();
        }else if(intervalo.incluye(this)){
            return this.clonar();
        }else if(this.incluye(intervalo.inferior)){
            return new Intervalo2(intervalo.inferior, superior);
        }else {
            return new Intervalo2(inferior, intervalo.superior);
        }
    }

    public boolean intersecta(Intervalo2 intervalo){
        assert intervalo != null;
        return  this.incluye(intervalo) || intervalo.incluye(this);
    }

    public void oponer(){
        double inferiorInicial = this.inferior;
        double superiorInicial = this.superior;
        this.inferior = -superiorInicial;
        this.superior = -inferiorInicial;
    }

    public void doblar(){
        double longitudInicial = this.longitud();
        this.inferior -= longitudInicial/2;
        this.superior += longitudInicial/2;
    }


    public double puntoMedio(){
        return (this.inferior + this.superior)/2;
    }
    public Intervalo2 simetrico(){
        return new Intervalo2();
    }
    public void escalar(double factor){}
    public boolean distinto(Intervalo2 intervalo){
        return true;
    }
    public Intervalo2 union(Intervalo2 intervalo){
        return new Intervalo2();
    }
    public Intervalo2 entre(Intervalo2 intervalo){
        return new Intervalo2();
    }

    public Intervalo2[] trocear(int trozos) {
        return null;
    }

    public void recoger() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("Inferior?");
        inferior = gestorIO.inDouble();
        gestorIO.out("Superior?");
        superior = gestorIO.inDouble();
    }

    public void mostrar() {
        new GestorIO().out("[" + inferior + "," + superior + "]");
    }


    public static void main(String[] args){
        Intervalo2 intervalo = new Intervalo2();
        intervalo.recoger();
        intervalo.mostrar();
        new GestorIO().out("Longitud: "+intervalo.longitud());
    }
}
