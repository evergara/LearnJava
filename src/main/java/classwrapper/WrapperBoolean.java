package classwrapper;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primitivoBoolean = num1 > num2;
        Boolean objectBoolean = Boolean.valueOf(primitivoBoolean);
        Boolean objectBoolean2 = Boolean.valueOf("false");
        System.out.println("primitivoBoolean = " + primitivoBoolean);
        System.out.println("ObjectBoolean = " + objectBoolean);
        System.out.println("ObjectBoolean2 = " + objectBoolean);

        System.out.println("Los boleanos siempre se compararn por valor tanto primitivo como objeto y comparan por valor");
        System.out.println("Comparando objetos Boolean = (objectBoolean == objectBoolean) " + (objectBoolean == objectBoolean));
        System.out.println("Comparando objetos Boolean = (objectBoolean .equals(objectBoolean) " + (objectBoolean .equals(objectBoolean)));
        System.out.println("Comparando objetos Boolean = (objectBoolean.booleanValue() == objectBoolean.booleanValue()) " + (objectBoolean.booleanValue() == objectBoolean.booleanValue()));


    }
}
