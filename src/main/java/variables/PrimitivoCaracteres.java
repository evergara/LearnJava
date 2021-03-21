package variables;

public class PrimitivoCaracteres {
    public static void main(String[] args) {
        char caracter = 'E';
        char caracter2 = '\u0040';
        char decimal = 64;
        char simbolo = '@';

        char espacio = ' ';
        char espacioUniCode = '\u0020';
        char retroceso  = '\b';
        char tabulador  = '\t';
        char saltoDeLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("caracter ="+ espacio + caracter);
        System.out.println("caracter2 =" + espacioUniCode  + caracter2);
        System.out.println("decimal = " + decimal);
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = caracter: " + (decimal == caracter2));
        System.out.println("decimal = simbolo: " + (decimal == simbolo));

        System.out.println("One Carater de retroceso: Play " + retroceso);
        System.out.println("Twice Carater de retroceso: Play " + retroceso + retroceso);
        System.out.println("Three Carater de retroceso: Play " + retroceso + retroceso + retroceso);

        System.out.println("One Carater de tabulador: Play " + tabulador + ".");
        System.out.println("Twice Carater de tabulador: Play " + tabulador + tabulador + "." );
        System.out.println("Three Carater de tabulador: Play " + tabulador + tabulador + tabulador + ".");


        System.out.println("One Carater de salto de Linea: Play " + saltoDeLinea + ".");
        System.out.println("Twice Carater de salto de Linea: Play " + saltoDeLinea + saltoDeLinea + "." );
        System.out.println("Three Carater de salto de Linea: Play " + saltoDeLinea + saltoDeLinea + saltoDeLinea + ".");

        System.out.println("One Carater de retorno de carro: Play " + retornoCarro + ".");
        System.out.println("Twice Carater de retorno de carro: Play " + retornoCarro + retornoCarro + ".." );
        System.out.println("Three Carater de retorno de carro: Play " + retornoCarro + retornoCarro + retornoCarro + "...");

        System.out.println("One de salto de Linea: Play getProperty" + System.getProperty("line.separator") +"Manejado por el sistema property  getProperty.");
        System.out.println("One de salto de Linea: Play lineSeparator" + System.lineSeparator() +"Manejado por el sistema. metodo  lineSeparator");

        getInfoTypeData("Char", caracter);
    }

    private static void  getInfoTypeData(String nameParam,  char numberParam){
        System.out.println("================ "+nameParam + ": "+ numberParam + " ================");
        System.out.println("Tipo " + nameParam + " corresponde en byte a " + Character.BYTES);
        System.out.println("Tipo " + nameParam + " corresponde en bites a " + Character.SIZE);
        System.out.println("Tipo " +nameParam + " el valor maximo de byte es " + Character.MAX_VALUE);
        System.out.println("Tipo " +nameParam + " el valor minimo de byte es " + Character.MIN_VALUE);
    }
}
