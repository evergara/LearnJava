package manejo_de_fechas;

import java.text.SimpleDateFormat;
import java.util.Date;


public class JavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        customizarFechas(fecha, "dd MMMM, YYYY");
        customizarFechas(fecha, "dd/MMMM/yyyy");
        customizarFechas(fecha, "'Fecha' yyyy.MMM.dd G 'Hora' HH:mm:ss Z");
        customizarFechas(fecha, "E dd 'de' MMMM, yyyy");
        customizarFechas(fecha, "EEEE dd 'de' MMMM, yyyy");
    }

    private static void customizarFechas(Date fecha,String format) {
        SimpleDateFormat df = new SimpleDateFormat(format);
        String fechaStr = df.format(fecha);
        System.out.println("El formato es: " +format + " , La fecha es " + fechaStr);
    }
}
