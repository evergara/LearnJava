package variables;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        metodoWievConsole();
        System.exit(0);
    }

    private static void metodoWievConsole(){
        binario();
        octal();
        hexadecimal();
    }
    private static void binario(){
        int numeroDecimal = 500;
        int numeroBinario = 0x1f4;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numeroBinario = " + numeroBinario);


        message("El numero decimal " + numeroDecimal + " corresponde a el binario " + Integer.toBinaryString(numeroDecimal));

    }

    private static void octal(){
        int numeroDecimal = 500;
        int numeroOctal = 0764;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numeroOctal = " + numeroOctal);


        message("El numero decimal " + numeroDecimal + " corresponde a el numero Octal " + Integer.toOctalString(numeroDecimal));

    }

    private static void hexadecimal(){
        int numeroDecimal = 500;
        int numerohexaDecimal = 0b111110100;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numeroOctal = " + numerohexaDecimal);


        message("El numero decimal " + numeroDecimal + " corresponde a el numero hexa Decimal " + Integer.toHexString(numeroDecimal));

    }

    private static void message(String message){
        System.out.println(message);
    }
}
