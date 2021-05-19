package cadenas;

public class EjemploSpringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        int repetiction = 100000;
       getConcat(a,b,c, repetiction);
       getConcatWithPlus(a,b,c, repetiction);
       getConcatStringBuilder(a,b,c, repetiction);
    }

    private static String getConcat(String a, String b, String c , int repetiction){
        logTime("getConcat", "Iniciando Proceso");
        long start = System.currentTimeMillis();
        String string ="";
        for (int i = 0; i <= repetiction; i++) {
            string +=  c.concat(a).concat(b).concat(System.getProperty("line.separator"));
           //c =  c.concat(a).concat(b).concat(String.valueOf(saltoDeLinea));
        }
        long end = System.currentTimeMillis();
        logTime("getConcat", "Terminando Proceso");
        System.out.println("Tiempo: " + (end - start));
        return string;
    }

    private static String getConcatWithPlus(String a, String b, String c , int repetiction){
        logTime("getConcatWithPlus", "Iniciando Proceso");
        long start = System.currentTimeMillis();
        String string ="";

        for (int i = 0; i <= repetiction; i++) {
            string +=  c+a+b+System.getProperty("line.separator");
        }
        long end = System.currentTimeMillis();
        logTime("getConcatWithPlus", "Terminando Proceso");
        System.out.println("Tiempo: " + (end - start));
        return string;
    }

    private static String getConcatStringBuilder(String a, String b, String c , int repetiction){
        logTime("getConcatStringBuilder", "Iniciando Proceso");
        long start = System.currentTimeMillis();
        StringBuilder string = new StringBuilder();

        for (int i = 0; i <= repetiction; i++) {
            string.append(c).append(a).append(b).append(System.getProperty("line.separator"));
        }
        long end = System.currentTimeMillis();
        logTime("getConcatStringBuilder", "Terminando Proceso");
        System.out.println("Tiempo: " + (end - start));
        return string.toString();
    }

    private static void logTime(String method, String time){
        StringBuilder cadena = new StringBuilder();
        cadena.append(time).append(method).append(": ").append(System.currentTimeMillis());
        System.out.println(cadena);
    }
}
