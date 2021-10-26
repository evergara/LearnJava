package poo.eit;

public class Intervalo {
    //DEFINICIÓN DE ATRIBUTOS
    private double puntoMedio;
    private double longitud;

    //Constructores
    public Intervalo(){
        this(0.0, 0.0);
    }

    public Intervalo(double superior){
        this(0.0, superior);
    }

    public Intervalo(double inferior, double superior){
        assert inferior <= superior;

        this.setSuperior(superior);
        this.setInferior(inferior);
    }

    public Intervalo(Intervalo intervalo){
        this(intervalo.getInferior(), intervalo.getSuperior());
    }

    //Metodos privados

    private double getSuperior() {
        return this.puntoMedio + this.longitud()/2;
    }

    private void setSuperior(double superior) {
        this.longitud = this.getSuperior() - superior;
        this.puntoMedio = superior - this.longitud()/2;
    }

    private double getInferior() {
        return this.puntoMedio - this.longitud()/2;
    }

    private void setInferior(double inferior) {
        this.longitud = this.getSuperior()-inferior;
        this.puntoMedio = inferior + this.longitud()/2;
    }

    //Metodos publico
    public double longitud(){
        return  longitud;
    }

    public void desplazar(double desplazamiento){
        this.setSuperior(this.getSuperior() + desplazamiento);
        this.setInferior(this.getInferior() + desplazamiento);
    }

    public Intervalo clonar(){
        return new Intervalo(this);
    }

    public Intervalo desplazado(double desplazamiento){
        //return new Intervalo(this.superior+desplazamiento,this.inferior + desplazamiento);
        Intervalo intervalo = this.clonar();
        intervalo.desplazar(desplazamiento);
        return intervalo;
    }

    public boolean incluye(double punto){
        //return Math.abs(punto - this.puntoMedio()) < this.longitud()/2;
        return this.getInferior() <= punto && punto<= this.getSuperior();
    }

    public boolean incluye(Intervalo intervalo){
        assert intervalo != null;

        //return this.inferior <= intervalo.inferior && intervalo.superior<=this.superior;
        return this.incluye(intervalo.getInferior()) && this.incluye(intervalo.getSuperior());
    }

    public boolean igual(Intervalo intervalo){
        assert intervalo != null;

        return this.getSuperior() == intervalo.getSuperior() && this.getInferior() == this.getInferior();
    }

    public boolean elMismo(Intervalo intervalo){
        return this == intervalo;
    }

    public Intervalo interseccion(Intervalo intervalo){
        assert this.intersecta(intervalo);

        if(this.intersecta(intervalo)){
            return intervalo.clonar();
        }else if(intervalo.incluye(this)){
            return this.clonar();
        }else if(this.incluye(intervalo.getInferior())){
            return new Intervalo(intervalo.getInferior(), getSuperior());
        }else {
            return new Intervalo(getInferior(), intervalo.getSuperior());
        }
    }

    public boolean intersecta(Intervalo intervalo){
        assert intervalo != null;
        return  this.incluye(intervalo) || intervalo.incluye(this);
    }

    public void oponer(){
        double inferiorInicial = this.getInferior();
        double superiorInicial = this.getSuperior();
        this.setInferior(-superiorInicial);
        this.setSuperior(-inferiorInicial);
    }

    public void doblar(){
        double longitudInicial = this.longitud();
        this.setInferior(this.getInferior() - longitudInicial/2);
        this.setSuperior(this.getSuperior() + longitudInicial/2);
    }


    public double puntoMedio(){
        return (this.getInferior() + this.getSuperior())/2;
    }
    public Intervalo simetrico(){
        return new Intervalo();
    }
    public void escalar(double factor){}
    public boolean distinto(Intervalo intervalo){
        return true;
    }
    public Intervalo union(Intervalo intervalo){
        return new Intervalo();
    }
    public Intervalo entre(Intervalo intervalo){
        return new Intervalo();
    }

    public Intervalo[] trocear(int trozos) {
        return null;
    }

    public void recoger() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("Inferior?");
        setInferior(gestorIO.inDouble());
        gestorIO.out("Superior?");
        setSuperior(gestorIO.inDouble());
    }

    public void mostrar() {
        new GestorIO().out("[" + getInferior() + "," + getSuperior() + "]");
    }


    public static void main(String[] args){
        Intervalo intervalo = new Intervalo();
        intervalo.recoger();
        intervalo.mostrar();
        new GestorIO().out("Longitud: "+intervalo.longitud());
    }
}
