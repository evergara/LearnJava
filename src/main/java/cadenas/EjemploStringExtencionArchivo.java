package cadenas;

public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna._imagen.png";
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(15));
        System.out.println("archivo.substring(archivo.indexOf(\".\")+1) = " + archivo.substring(archivo.indexOf(".")+1));
        System.out.println("archivo.substring(archivo.lastIndexOf(\".\")+1) = " + archivo.substring(archivo.lastIndexOf(".")+1));
    }
}
