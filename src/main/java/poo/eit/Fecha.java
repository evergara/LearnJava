package poo.eit;

import java.util.StringTokenizer;

class Fecha {

    private int dia;

    private int mes;

    private int year;

    private static final int[] DIAS_MESES = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static final char[] INICIALES_DIAS = new char[] {'s','d','l','m','x','j','v'};

    public Fecha(){
        this(1,1,1);
    }

    public Fecha(int dia, int mes, int year){
        this.set(dia, mes, year);
    }

    public Fecha(Fecha fecha){
        this(fecha.dia, fecha.mes, fecha.year);
    }

    // 12/5/2008
    public Fecha(String fecha){
        StringTokenizer analizador = new StringTokenizer(fecha, "/");
        dia = Integer.parseInt(analizador.nextToken());
        mes = Integer.parseInt(analizador.nextToken());
        year = Integer.parseInt(analizador.nextToken());
    }

    public Fecha(int timeStamp){

    }

    private void set(int dia, int mes, int year){
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }

    public void set(Fecha fecha){
        this.set(fecha.dia, fecha.mes, fecha.year);
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getYear(){
        return year;
    }

    public Fecha clone(){
        return new Fecha(dia, mes, year);
    }

    public void mostrar(){
        new GestorIO().out(dia+"/"+mes+"/"+year);

    }

    public String toStringCAS(){
        return dia+"/"+mes+"/"+year;
    }

    public String toStringUSA(){
        return mes+"/"+dia+"th, "+year;
    }

    public boolean igual(Fecha fecha){
        return dia == fecha.dia &&
                mes == fecha.mes &&
                year == fecha.year;
    }

    public boolean anterior (Fecha fecha){
        return this.diasOrigen() < fecha.diasOrigen();
    }

    public boolean posterior (Fecha fecha){
        return !this.igual(fecha) && !this.anterior(fecha);
    }

    public int diferencia(Fecha fecha){
        return this.diasOrigen() - fecha.diasOrigen();
    }

    private int diasOrigen() {
        int resultado = this.diaYear();
        resultado += 365*(year-1);
        for(int i=1; i<year-1; i++){
            if (Fecha.bisiesto(i)){
                resultado++;
            }
        }
        return resultado;
    }

    public static boolean bisiesto(int year){
        return year%4 == 0 && year%100!=0 || year%400==0;
    }

    public static int diasYear(int year){
        int resultado = 365;
        if (Fecha.bisiesto(year)){
            resultado++;
        }
        return resultado;
    }

    public int diaYear() {
        int resultado = dia;
        for(int i=0; i<(mes-1); i++){
            resultado += DIAS_MESES[i];
        }
        if (mes>2 && this.checkBisiesto()){
            resultado++;
        }
        return resultado;
    }

    public boolean festivo(){
        final char DIA_SEMANA = this.diaSemana();
        return DIA_SEMANA == 's' || DIA_SEMANA == 'd' ;
    }

    public char diaSemana(){
        return INICIALES_DIAS[(this.diasOrigen()-1)%7];
    }

    public char estacion(){
        return ' ';
    }

    public int numeroSemana(){
        return (this.diasOrigen() - new Fecha(1,1,year).diasOrigen())/7+1;
    }

    private void incrementar(){
        dia++;
        if (dia>DIAS_MESES[mes-1]){
            dia = 1;
            mes++;
            if (mes>12){
                mes = 1;
                year++;
            }
        }
    }

    public void incrementar(int dias){
        for(int i=0; i<dias; i++){
            this.incrementar();
        }
    }

    public boolean checkBisiesto(){
        return Fecha.bisiesto(year);
    }

}