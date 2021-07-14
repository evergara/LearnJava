package classwrapper;

public class WrapperOperadoresRelacionaales {
    public static void main(String[] args) {
        Integer numero1 = Integer.valueOf("10010202");
        Integer numero2 = numero1;

        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);

        System.out.println("Son el mismo objecto? " + (numero1 == numero2 ));
        System.out.println("Tienen el mismo valor? " + (numero1.equals(numero2) ));
        System.out.println("Tienen el mismo valor? " + (numero1.intValue() == numero2.intValue() ));


        numero2 = 10000;

        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);
        System.out.println("Son el mismo objecto? " + (numero1 == numero2 ));
        System.out.println("Tienen el mismo valor? " + (numero1.equals(numero2) ));
        System.out.println("Tienen el mismo valor? " + (numero1.intValue() == numero2.intValue() ));

        numero2 = 10010202;

        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);
        System.out.println("Son el mismo objecto? " + (numero1 == numero2 ));
        System.out.println("Tienen el mismo valor? " + (numero1.equals(numero2) ));
        System.out.println("Tienen el mismo valor? " + (numero1.intValue() == numero2.intValue() ));

        System.out.println("============Condiciones=======================");
        
        boolean isMayor = numero1 > numero2;
        boolean isMayor2 = numero1.intValue() > numero2.intValue();
        System.out.println("isMayor = " + isMayor);
        System.out.println("isMayor2 = " + isMayor2);

        casoEspial("127", 127);
    }

    private static void casoEspial(String nm1, Integer nnm2){
        Integer numero1 = Integer.valueOf(nm1);
        Integer numero2 = numero1;

        System.out.println("============Caso especial que solo se da hasta 127 particularida de Java=======================");
        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);

        System.out.println("Son el mismo objecto? " + (numero1 == numero2 ));
        System.out.println("Tienen el mismo valor? " + (numero1.equals(numero2) ));
        System.out.println("Tienen el mismo valor? " + (numero1.intValue() == numero2.intValue() ));


        numero2 = nnm2;

        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);

        System.out.println("Son el mismo objecto? " + (numero1 == numero2 ));
        System.out.println("Tienen el mismo valor? " + (numero1.equals(numero2) ));
        System.out.println("Tienen el mismo valor? " + (numero1.intValue() == numero2.intValue() ));
    }
}
