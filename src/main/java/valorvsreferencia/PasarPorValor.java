package valorvsreferencia;

public class PasarPorValor {
    public static void main(String[] args) {
        tiposPrimitivos();
        tiposObjetos();
    }

    private static void tiposPrimitivos() {
        System.out.println("===============Datos primitivos==================");
        int numero = 15;
        System.out.println("Iniciamos el numero con el valor = " + numero);
        pasarNumeroOtroMetrodo(numero);
        System.out.println("Terninamos el numero con el valor = " + numero);

    }

    private static void pasarNumeroOtroMetrodo(int numero) {
        System.out.println("===============pasarNumeroOtroMetrodo==================");
        System.out.println("Recibimos  el numero con el valor = " + numero);
        numero = 25;
        System.out.println("Cambiamos  el numero con el valor = " + numero);
    }

    private static void tiposObjetos() {
        System.out.println("===============Datos Objetos==================");
        Integer numero = 15;
        System.out.println("Iniciamos el numero con el valor = " + numero);
        pasarNumeroOtroMetrodoObjeto(numero);
        System.out.println("Terninamos el numero con el valor = " + numero);
    }

    private static void pasarNumeroOtroMetrodoObjeto(Integer numero) {
        System.out.println("===============pasarNumeroOtroMetrodoObjeto==================");
        System.out.println("Recibimos  el numero con el valor = " + numero);
        numero = 25;
        System.out.println("Cambiamos  el numero con el valor = " + numero);
    }
    //Nota; esto se debe a que las clases Wrapper de java son inmutable por eso ese comportamiento
}
