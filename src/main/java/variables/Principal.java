package variables;

import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        String name = "E vergara";
        int number = 7;
        String variable = "Hola";
        boolean isVerdad = true;
        
        System.out.println("number = " + number);
        System.out.println("Hola Mundo " + name.toUpperCase() + " mi numero es " + number);
        
        if (isVerdad){
            System.out.println("isVerdad = " + isVerdad);
        }

        if (((Object)variable).getClass().getName() == "java.lang.String"){
            System.out.println("variable = " + ((Object)variable).getClass().getName());

        }


        System.out.println("variable = " + ((Object)variable).getClass().getName());
        if (((Object)variable).getClass().getName() == "java.lang.int"){
            System.out.println("variable = " + ((Object)variable).getClass().getName());
        }
    }
}
