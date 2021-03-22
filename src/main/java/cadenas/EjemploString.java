package cadenas;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = "Programacion Java";

        String cursoNew = new String("Programacion Java");
        String cursoNew2 = new String("Programacion JAVA");
        //

        //no es igual por que so objetos diferentes y aqui comparamos los objetos en este caso por que son referencia
        boolean esIgual= curso == cursoNew;
        System.out.println("curso == cursoNew => " + esIgual);

        //Debe dar true por que aqui se compara por valor y los valores son iguales
        esIgual = curso.equals(cursoNew);
        System.out.println("curso.equals(cursoNew) => " + esIgual);

        //Debe dar true por que aqui se compara por valor y la opion equalsIgnoreCase pone los valores iguales
        // encuanto a mayusculas y minusculas los valores son iguales
        esIgual = curso.equalsIgnoreCase(cursoNew2);
        System.out.println("curso.equalsIgnoreCase(cursoNew2) => " + esIgual);

        //Debe dar true por que aqui compara por referencia y en este caso la maquina virtual apesar de que son dos objetos
        //al momento de crear el segundo solo pone una referencia al primero
        esIgual= curso == curso2;
        System.out.println("curso == curso2 =>" + esIgual);
    }

}
