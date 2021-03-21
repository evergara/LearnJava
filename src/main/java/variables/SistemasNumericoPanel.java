package variables;

import javax.swing.*;

public class SistemasNumericoPanel {

    public static void main(String[] args) {
        metodoPanel();
        System.exit(0);
    }

    private static void metodoPanel(){
        String numeroInt = "";
        do{
            numeroInt = JOptionPane.showInputDialog(null, "Ingrese un número entero");

            if(isNumeric(numeroInt)){
                gestionTiposNumericos(Integer.parseInt(numeroInt));
            }else{
                messagePanel("Digite  un número valido, por favor");

            }

        }while(!isNumeric(numeroInt));
    }

    private static void messagePanel(String message){
        JOptionPane.showInternalMessageDialog(null, message);
    }

    private static void gestionTiposNumericos(int numero){
        String message = "";
        String newLine = System.lineSeparator();
        message += getBinarioInfo(numero);
        message += newLine + getOctalInfo(numero);
        message += newLine + getHexadecimalInfo(numero);
        messagePanel(message);
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
