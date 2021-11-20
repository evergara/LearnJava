package manejo_de_fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        final String FORMATED = "yyyy-MM-dd";
        String stringHora = "2021-11-20";

        StringToDate(FORMATED, stringHora);
    }

    private static void StringToDate(String formated, String stringHora) {
        SimpleDateFormat fd = new SimpleDateFormat(formated);
        Date fecha;

        try {
            fecha = fd.parse(stringHora);
            System.out.println("fecha = " + fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
