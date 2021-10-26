package condicionales;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SentenciasDeControl {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        SentenciasDeControl sentencia = new SentenciasDeControl();
        sentencia.calcularNumeroDiasDelAnoSwitch();
        sentencia.nameMonth();
        sentencia.switchBasic();
        sentencia.ifElse();
        sentencia.calcularNumeroDiasDelAnoIfElse();

    }

    private void calcularNumeroDiasDelAnoSwitch() {
        int[] datos = lectorMesAndAnio();
        int numeroDias = 0;
        int mes = datos[0];
        int anio = datos[1];

        switch (mes){
            case 1:
            case 3:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                numeroDias = isBisiesto(anio) ? 29: 28;
                break;
            default:
                displayMessage("Mes no valido");
        }

        StringBuilder sb = new StringBuilder();
        sb.append("El mes ").append(mes).append(" del year ").append(anio).append(", tiene ").append(numeroDias).append(" dias");
        displayMessage(sb.toString());
    }

    private void nameMonth() {
        Scanner sc = new Scanner(System.in);
        displayMessage("Digite el mes de 1 a 12");
        int month = sc.nextInt();
        String monthName = null;

        switch (month){
            case 1:
                monthName = "Enero";
                break;
            case 2:
                monthName = "Febrero";
                break;
            case 3:
                monthName = "Marzo";
                break;
            case 4:
                monthName = "Abril";
                break;
            case 5:
                monthName = "Mayo";
                break;
            case 6:
                monthName = "Junio";
                break;
            case 7:
                monthName = "Julio";
                break;
            case 8:
                monthName = "Agosto";
                break;
            case 9:
                monthName = "Septiembre";
                break;
            case 10:
                monthName = "Octubre";
                break;
            case 11:
                monthName = "Niviembre";
                break;
            case 12:
                monthName = "Dicienbre";
                break;
            default:
                displayMessage("Mes no valido");
        }

        if (!monthName.equals(null)){
            displayMessage(monthName);
        }
    }

    private void switchBasic() {
        Scanner sc = new Scanner(System.in);

        displayMessage("Digite un numero");

        int num = sc.nextInt();


        switch (num){
            case 0:
                displayMessage("el valor es 0");
                break;
            case 1:
                displayMessage("el valor es 1");
                break;
            case 2:
                displayMessage("el valor es 2");
                break;
            case 3:
                displayMessage("el valor es 3");
                break;
            case 4:
                displayMessage("el valor es 4");
                break;
            default:
                displayMessage("el valor es igual o mayor que 5");
        }
    }

    private void calcularNumeroDiasDelAnoIfElse() {
        int[] datos = lectorMesAndAnio();
        int numeroDias = 0;
        int mes = datos[0];
        int anio = datos[1];
        if (mes == 1 || mes ==3 || mes ==3 || mes ==7 || mes ==8 || mes ==10 || mes ==12) {
            numeroDias = 31;
        } else if ( mes ==4 || mes ==6 || mes ==9 || mes == 11) {
            numeroDias = 30;
        } else if (mes == 2) {
            if(isBisiesto(anio)){
                numeroDias = 29;
            }else {
                numeroDias = 28;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("El mes ").append(mes).append(" del year ").append(anio).append(", tiene ").append(numeroDias).append(" dias");
        displayMessage(sb.toString());
    }
    private void displayMessage(String message){
        System.out.println(message);
    }
    private void ifElse() {

        float promedio = lectorNotas();
        if (promedio == 5.0) {
            displayMessage("Excelente promedio, Felicitaciones. \nPromedio: " + promedio);
        } else if (promedio >= 4.5) {
            System.out.println();
            displayMessage("Buen promedio, Felicitaciones. \nPromedio: " + promedio);
        } else if (promedio >= 3.5) {
            displayMessage("Buen promedio. \nPromedio: " + promedio);
        } else if (promedio >= 3.0) {
            System.out.println("Haz pasado la materia, pero el promedio es regular. \nPromedio: " + promedio);
        } else {
            displayMessage("Insuficiente, necesitas estudiar mas. reprobastes. \nPromedio: " + promedio);
        }
    }

    private float lectorNotas() {
        Scanner sc = new Scanner(System.in);
        displayMessage("Digite su primera nota");
        float numero1 = sc.nextFloat();
        displayMessage("Digite su segunda nota");
        float numero2 = sc.nextFloat();

        displayMessage("Digite su tercera nota");
        float numero3 = sc.nextFloat();

        return (numero1 + numero2 + numero3) / 3;
    }

    private int[] lectorMesAndAnio() {
        int[] datos = new int[2];
        Scanner sc = new Scanner(System.in);
        displayMessage("Digite el mes de 1 a 12");
        datos[0] = sc.nextInt();
        displayMessage("Digite el year (YYYY)");
        datos[1] = sc.nextInt();

        return datos;
    }

    private boolean isBisiesto(int anio) {
        return (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0)));
    }
}
