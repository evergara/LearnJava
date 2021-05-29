package operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        OperadorInstanceOf oi = new OperadorInstanceOf();
        oi.tipoString();
        oi.tipoInteger();
        oi.tipoGenericosOrAbtracto();
    }

    private void tipoGenericosOrAbtracto() {
        Object texto = "Creando un objeto de la clase String";
        System.out.println("tipoGenericosOrAbtracto: Valor" + texto);
        System.out.println("texto instanceof Object  = " + texto instanceof Object );
        System.out.println("texto instanceof String  = " + texto instanceof String );
        System.out.println("texto instanceof Integer  = " + (texto instanceof Integer ));
    }

    private void tipoInteger() {
        Integer num = 7;
        System.out.println("num  = " + num );
        System.out.println("num instanceof Integer  = " + (num instanceof Integer ));
        System.out.println("num instanceof Object  = " + (num instanceof Object ));
    }

    private void tipoString() {
        String texto = "Creando un objeto de la clase String";
        String objtexto = "Creando un objeto de la clase String";

        System.out.println("objtexto instanceof String  = " + objtexto instanceof String );
        System.out.println("texto instanceof String  = " + texto instanceof String );

    }
}
