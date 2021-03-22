package cadenas;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = "Diseño con Java";
        String profesor = "Emerson vergara";

        String detalles = curso + " Con el intructor " + profesor;
        System.out.println("detalles = " + detalles);

        int numeroA = 10;
        int numeroB = 15;

        //Ojo con estos ejemplo influye la ley presendencia de los operadores(de izquierda a derecha)
        System.out.println(detalles + numeroA + numeroB);
        System.out.println(numeroA + numeroB + detalles);
        System.out.println(detalles + (numeroA + numeroB));

        //Los string son inmutables no cambian los metodos de los string devuelven otra Instacia
        
        String detalle2 = curso.concat(" Con el intructor ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);


        String detalle3 = curso.transform(c -> {
           return c.concat(" con el intructor ").concat(profesor);
        });

        System.out.println("detalle3 = " + detalle3);

        System.out.println("Curso sigue igual = " + curso);

    }

}
