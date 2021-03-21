package variables;

public class ConversionDeTipos {
    public static void main(String[] args) {
        parseInt("50");
        parseDouble("50.1");
        parseBoolean("TREU");
        parseLong("2525");
        parseFloat("50.1");
        castLongToInt(200000);
        castIntToShort(10000);
    }

    private static void parseInt(String numero){
        try {
            mesaage("La conversion parseInt es "  + Integer.parseInt(numero));
            parseStringtoString(Integer.parseInt(numero));
            parseStringValueOf(Integer.parseInt(numero));
        }catch (NumberFormatException nfe){
            mesaage("Error en la conversion "+ nfe.getMessage());
        }
    }

    private static void parseDouble(String numero){
        try {
            mesaage("La conversion parseDouble es "  + Double.parseDouble(numero));
        }catch (NumberFormatException nfe){
            mesaage("Error en la conversion "+ nfe.getMessage());
        }
    }

    private static void parseBoolean(String isLogico){
        try {
            mesaage("La conversion parseBoolean es "  + Boolean.parseBoolean(isLogico));
        }catch (NumberFormatException nfe){
            mesaage("Error en la conversion "+ nfe.getMessage());
        }
    }

    private static void parseLong(String numero){
        try {
            mesaage("La conversion parseLong es "  + Long.parseLong(numero));
        }catch (NumberFormatException nfe){
            mesaage("Error en la conversion "+ nfe.getMessage());
        }
    }

    private static void parseFloat(String numero){
        try {
            mesaage("La conversion parseFloat es "  + Float.parseFloat(numero));
        }catch (NumberFormatException nfe){
            mesaage("Error en la conversion "+ nfe.getMessage());
        }
    }

    private static void parseStringtoString(int numero){
        try {
            mesaage("La conversion parseString  con toString es "  + Integer.toString(numero));
        }catch (NumberFormatException nfe){
            mesaage("Error en la conversion "+ nfe.getMessage());
        }
    }

    private static void parseStringValueOf(int numero){
        try {
            mesaage("La conversion parseString  con valueOf es "  + String.valueOf(numero));
        }catch (NumberFormatException nfe){
            mesaage("Error en la conversion "+ nfe.getMessage());
        }
    }

    public static void mesaage(String message) {
        System.out.println("message = " + message);
    }

    private static void castIntToShort(int numero){
        try {
            mesaage("La conversion castIntToShort   es "  + (short)numero);
        }catch (NumberFormatException nfe){
            mesaage("Error en la conversion "+ nfe.getMessage());
        }
    }

    private static void castLongToInt(long numero){
        try {
            mesaage("La conversion castLongToInt   es "  + (int)numero);
        }catch (NumberFormatException nfe){
            mesaage("Error en la conversion "+ nfe.getMessage());
        }
    }
}
