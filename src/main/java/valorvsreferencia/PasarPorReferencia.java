package valorvsreferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edades = {10,11,12};

        System.out.println("Iniciamos edades  = " + edades);
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades["+ i +"] = " + edades[i]);
        }
        System.out.println("antes de llamar al metodo testReferencia");
        testReferencia(edades);
        System.out.println("Despues de llamar al metodo testReferencia");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades["+ i +"] = " + edades[i]);
        }
        System.out.println("Finalizamos edades  = " + edades);

    }

    private static void testReferencia(int[] edadesArr) {
        System.out.println("Iniciamos el metodo testReferencia");
        for (int i = 0; i < edadesArr.length; i++) {
            edadesArr[i] +=20;
        }
        System.out.println("modificamos el edadesArr");

        System.out.println("Finalizamos el metodo testReferencia");
    }
}
