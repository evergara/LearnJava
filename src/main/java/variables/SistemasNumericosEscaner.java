package variables;

import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosEscaner {
    public static void main(String[] args) {
        metodoTerminal();
        System.exit(0);
    }

    private static void metodoTerminal(){
        String numeroInt = "";
        Scanner scanner = new Scanner(System.in);
        do{
            message("Ingrese un número entero");
            numeroInt = scanner.nextLine();

            if(isNumeric(numeroInt)){
                gestionTiposNumericos(Integer.parseInt(numeroInt));
            }else{
                message("Digite  un número valido, por favor");
            }

        }while(!isNumeric(numeroInt));
    }

    private static void message(String message){
        System.out.println("message = " + message);;
    }

    private static void gestionTiposNumericos(int numero){
        String message = "";
        String newLine = System.lineSeparator();
        message += getBinarioInfo(numero);
        message += newLine + getOctalInfo(numero);
        message += newLine + getHexadecimalInfo(numero);
        message(message);
    }


    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }

    private static String getBinarioInfo(int numero){
        return "El numero decimal " + numero + " corresponde a el  número binario " + Integer.toBinaryString(numero);
    }

    private static String getOctalInfo(int numero){
        return "El numero decimal " + numero + " corresponde a el número Octal " + Integer.toOctalString(numero);
    }

    private static String getHexadecimalInfo(int numero){
        return "El numero decimal " + numero + " corresponde a el número Hexadecimal " + Integer.toHexString(numero);
    }

}
