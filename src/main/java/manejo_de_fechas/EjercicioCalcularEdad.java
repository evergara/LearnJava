package manejo_de_fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjercicioCalcularEdad {

    public static void main(String[] args) {
        String fechaDeNacimiento = pedirFechaDeNacimiento();
        int edad = calcularEdad(parseStringToDate(fechaDeNacimiento));
        System.out.println("La edad es: " + edad);
    }

    private static Date parseStringToDate(String stringfechaDeNacimiento) {
        final String FORMATED = "dd/MM/yyyy";
        Date fechaNacimiento = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(FORMATED);

        try {
            fechaNacimiento = sdf.parse(stringfechaDeNacimiento);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return  fechaNacimiento;
    }

    private static int calcularEdad(Date fechaNacimiento) {
        final String FORMATED = "yyyyMMdd";
        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(FORMATED);
        int desde = Integer.parseInt(sdf.format(fechaNacimiento));
        int hasta = Integer.parseInt(sdf.format(fechaActual));

        return  (hasta - desde)/10000;
    }

    private static String pedirFechaDeNacimiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite su fecha de nacimiento con el siguiente formato: nacimiento dia/mes/año ejemplo: 07/12/2016");
        return scanner.nextLine();
    }

}
