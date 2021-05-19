package cadenas;

import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Evergara";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Evergara\") = " + nombre.equals("Evergara"));
        System.out.println("nombre.equals(\"evergara\") = " + nombre.equals("evergara"));
        System.out.println("nombre.equals(\"evergara\") = " + nombre.equalsIgnoreCase("evergara"));
        //orden lexico grafico teniendo la tabla unicode
        System.out.println("nombre.compareTo(\"evergara\") = " + nombre.compareTo("evergara"));
        System.out.println("nombre.compareToIgnoreCase(\"evergara\") = " + nombre.compareToIgnoreCase("evergara"));
        System.out.println("nombre.compareToIgnoreCase(\"cesar\") = " + nombre.compareToIgnoreCase("cesar"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(4) = " + nombre.charAt(4));
        System.out.println("nombre.charAt(7) = " + nombre.charAt(7));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(0) = " + nombre.substring(0));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(4) = " + nombre.substring(4));
        System.out.println("nombre.substring(2,5) = " + nombre.substring(2,5));
        System.out.println("nombre.substring(2, nombre.length()) = " + nombre.substring(2,nombre.length()));
        System.out.println("nombre.substring(7) = " + nombre.substring(7));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        System.out.println("nombre.replace(\"E\", \"i\") = " + nombre.replace("E", "i"));
        System.out.println("nombre.replace(\"A\", \"E\") = " + nombre.replace("A", "E"));
        System.out.println("nombre.replace(\"a\", \"E\") = " + nombre.replace("a", "E"));
        System.out.println("nombre.indexOf(\"a\") = " + nombre.indexOf("a"));
        System.out.println("nombre.indexOf(\"a\") = " + nombre.lastIndexOf("a"));
        System.out.println("nombre.indexOf(\"E\") = " + nombre.lastIndexOf("E"));
        System.out.println("nombre.indexOf(\"Z\") = " + nombre.lastIndexOf("Z"));
        System.out.println("nombre.contains(\"Z\") = " + nombre.contains("Z"));
        System.out.println("nombre.contains(\"E\") = " + nombre.contains("E"));
        System.out.println("nombre.contains(\"a\") = " + nombre.contains("a"));
        System.out.println("nombre.startsWith(\"a\") = " + nombre.startsWith("a"));
        System.out.println("nombre.startsWith(\"e\") = " + nombre.startsWith("e"));
        System.out.println("nombre.startsWith(\"E\") = " + nombre.startsWith("E"));
        System.out.println("nombre.endsWith(\"E\") = " + nombre.endsWith("E"));
        System.out.println("nombre.endsWith(\"a\") = " + nombre.endsWith("a"));
        System.out.println("nombre.endsWith(\"ra\") = " + nombre.endsWith("ra"));
        System.out.println(" " + nombre +" "+":");
        System.out.println((" " + nombre +" "+":").trim());
    }
}
