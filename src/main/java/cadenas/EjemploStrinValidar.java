package cadenas;

import java.util.Locale;

public class EjemploStrinValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNull = curso == null;

        System.out.println("esNull " + esNull );
        //Validamos si es null
        if(esNull == false){
            System.out.println(curso.toUpperCase());
        }else{
            curso = "";
        }
        //esto solo es de java 11 en adelante
        if (curso.isBlank()){
            curso = "JAVA EE";
        }
        //Validamos si es vacio
        if(curso.isEmpty()){
           curso = "java";
        }


        System.out.println("Bienvenido a el curso " + curso );
    }
}
