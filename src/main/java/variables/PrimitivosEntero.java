package variables;

public class PrimitivosEntero {

    public static void main(String[] args) {
        byte numeroByte = 127;
        getInfoTypeData("numeroByte", numeroByte);


        short numeroShort = 32767;
        getInfoTypeData("numeroShort", numeroShort);

        int numeroInt = 2147483647;
        getInfoTypeData("numeroInt", numeroInt);

        long numeroLong = 9223372036854775807l;
        getInfoTypeData("numeroLong", numeroLong);

        float numeroFloat = 3.4028235E38F;
        getInfoTypeData("numeroFloat", numeroFloat);

        double numerDouble = 1.7976931348623157E308D;
        getInfoTypeData("numerDouble", numerDouble);

    }

    private static void  getInfoTypeData(String nameParam, byte numberParam){
        System.out.println("================ "+nameParam + ": "+ numberParam + " ================");
        System.out.println("Tipo " + nameParam + " corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo " + nameParam + " corresponde en bites a " + Byte.SIZE);
        System.out.println("Tipo " +nameParam + " el valor maximo de byte es " + Byte.MAX_VALUE);
        System.out.println("Tipo " +nameParam + " el valor minimo de byte es " + Byte.MIN_VALUE);
    }

    private static void  getInfoTypeData(String nameParam,  short numberParam){
        System.out.println("================ "+nameParam + ": "+ numberParam + " ================");
        System.out.println("Tipo " + nameParam + " corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo " + nameParam + " corresponde en bites a " + Short.SIZE);
        System.out.println("Tipo " +nameParam + " el valor maximo de byte es " + Short.MAX_VALUE);
        System.out.println("Tipo " +nameParam + " el valor minimo de byte es " + Short.MIN_VALUE);
    }


    private static void  getInfoTypeData(String nameParam, int numberParam){
        System.out.println("================ "+nameParam + ": "+ numberParam + " ================");
        System.out.println("Tipo " + nameParam + " corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo " + nameParam + " corresponde en bites a " + Integer.SIZE);
        System.out.println("Tipo " +nameParam + " el valor maximo de byte es " + Integer.MAX_VALUE);
        System.out.println("Tipo " +nameParam + " el valor minimo de byte es " + Integer.MIN_VALUE);
    }

    private static void  getInfoTypeData(String nameParam, long numberParam){
        System.out.println("================ "+nameParam + ": "+ numberParam + " ================");
        System.out.println("Tipo " + nameParam + " corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo " + nameParam + " corresponde en bites a " + Long.SIZE);
        System.out.println("Tipo " +nameParam + " el valor maximo de byte es " + Long.MAX_VALUE);
        System.out.println("Tipo " +nameParam + " el valor minimo de byte es " + Long.MIN_VALUE);
    }

    private static void  getInfoTypeData(String nameParam, float numberParam){
        System.out.println("================ "+nameParam + ": "+ numberParam + " ================");
        System.out.println("Tipo " + nameParam + " corresponde en byte a " + Float.BYTES);
        System.out.println("Tipo " + nameParam + " corresponde en bites a " + Float.SIZE);
        System.out.println("Tipo " +nameParam + " el valor maximo de byte es " + Float.MAX_VALUE);
        System.out.println("Tipo " +nameParam + " el valor minimo de byte es " + Float.MIN_VALUE);
    }

    private static void  getInfoTypeData(String nameParam, double numberParam){
        System.out.println("================ "+nameParam + ": "+ numberParam + " ================");
        System.out.println("Tipo " + nameParam + " corresponde en byte a " + Double.BYTES);
        System.out.println("Tipo " + nameParam + " corresponde en bites a " + Double.SIZE);
        System.out.println("Tipo " +nameParam + " el valor maximo de byte es " + Double.MAX_VALUE);
        System.out.println("Tipo " +nameParam + " el valor minimo de byte es " + Double.MIN_VALUE);
    }
}
