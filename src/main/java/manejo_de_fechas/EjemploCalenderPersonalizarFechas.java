package manejo_de_fechas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploCalenderPersonalizarFechas {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("calendar = " + calendar);

        calendar.set(2021, 11, 12);
        Date fecha = calendar.getTime();
        showdate(fecha);

        calendar.set(2021, Calendar.DECEMBER, 12, 18, 30, 50);
        fecha = calendar.getTime();
        showdate(fecha);

        calendar.set(Calendar.YEAR, 2021);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH,12);
        calendar.set(Calendar.HOUR_OF_DAY,21);
        calendar.set(Calendar.MINUTE,15);
        calendar.set(Calendar.SECOND,45);
        calendar.set(Calendar.MILLISECOND,125);
        fecha = calendar.getTime();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
        String fechaConFormato = df.format(fecha);
        showdate(fechaConFormato);

        calendar.set(Calendar.YEAR, 2021);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH,12);
        calendar.set(Calendar.HOUR,7);
        calendar.set(Calendar.AM_PM,Calendar.PM);
        calendar.set(Calendar.MINUTE,15);
        calendar.set(Calendar.SECOND,45);
        calendar.set(Calendar.MILLISECOND,125);
        fecha = calendar.getTime();
        df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:SSS a");
        fechaConFormato = df.format(fecha);
        showdate(fechaConFormato);

    }

    private static void showdate(String fechaConFormato) {
        System.out.println("fechaConFormato = " + fechaConFormato);
    }

    private static void showdate(Date fecha) {
        System.out.println("fecha = " + fecha);
    }


}
