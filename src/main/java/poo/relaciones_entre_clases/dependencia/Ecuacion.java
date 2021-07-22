package poo.relaciones_entre_clases.dependencia;

public class Ecuacion {
    private int a;
    private int b;
    private int c;

    public  Ecuacion(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double resolver(){
      double value = getCuadratica();
      double numerador =  -(this.b) + value;
      return numerador/(2*this.a);
    }

    private double getCuadratica() {
        return Math.pow(this.b,2) - 4*a*c;
    }

}
