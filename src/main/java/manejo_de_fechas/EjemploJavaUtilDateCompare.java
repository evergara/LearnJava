package manejo_de_fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDateCompare {
    public static void main(String[] args) {
        final String FORMATED = "yyyy-MM-dd";
        String stringHora = "2021-11-20";

        StringToDate(FORMATED, stringHora);
    }

    private static void StringToDate(String formated, String stringHora) {
        SimpleDateFormat fd = new SimpleDateFormat(formated);
        Date fecha = new Date();
        Date dateNow = new Date();

        try {
            fecha = fd.parse(stringHora);
            System.out.println("fecha = " + fecha);
            System.out.println("dateNow = " + dateNow);

            compararFechas(fecha, dateNow);
            compararFechasConCompareo(fecha, dateNow);

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    private static void compararFechas(Date fecha, Date dateNow) {
        if(fecha.after(dateNow)){
            System.out.println("La fecha (del  usuario ) es despues de la fecha actual");
        } else if(fecha.before(dateNow)){
            System.out.println("La fecha del  usuario es antes de la fecha actual");
        }else if(fecha.equals(dateNow)){
            System.out.println("La fecha del usuario es a la fecha actual");
        }
    }

    private static void compararFechasConCompareo(Date fecha, Date dateNow) {
        if(fecha.compareTo(dateNow) > 0 ){
            System.out.println("La fecha (del  usuario ) es despues de la fecha actual");
        } else if(fecha.compareTo(dateNow) < 0){
            System.out.println("La fecha del  usuario es antes de la fecha actual");
        }else if(fecha.compareTo(dateNow) == 0){
            System.out.println("La fecha del usuario es a la fecha actual");
        }
    }
}
