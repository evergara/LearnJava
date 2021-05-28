package operadores;

public class OperadorAritmeticos {
    public static void main(String[] args) {
        start();
    }

    private static void start(){
        OperadorAritmeticos operadoe = new OperadorAritmeticos();
        operadoe.suma();
        operadoe.resta();
        operadoe.multiplicar();
        operadoe.dividir();
        operadoe.dividirResto();
    }

    private void suma(){
        //declaramos variables
        int i = 4, j = 5, suma = i + j;
        //Imprimimos suma despues de usar el operador +
        System.out.println("i = "+ i +" j = " + j);
        System.out.println("Suma = " + suma);

        //Ojo: Imprimimos usando el operador + para concatenacion

        System.out.println("i + j = " + i + j);
        //Ojo: Imprimimos usando el operador + para concatenacion pero le damos precedencia con los parentices
        System.out.println("i + j = " + (i + j));
        System.out.println("======================================================================");

    }

    private void resta(){
        //declaramos variables
        int i = 4, j = 5, resta = i - j;
        //Imprimimos suma despues de usar el operador +
        System.out.println("i = "+ i +" j = " + j);
        System.out.println("Resta = " + resta);

        //Ojo: Imprimimos usando el operador - para concatenacion,
        //pero  este operador ya no se puede realizar como + porque la concatenacion no lo reconoce


        //Ojo: Imprimimos usando el operador - para concatenacion pero le damos precedencia con los parentices
        System.out.println("i - j = " + (i - j));
        System.out.println("======================================================================");
    }

    private void multiplicar(){
        //declaramos variables
        int i = 4, j = 5, multiplicacion = i * j;
        System.out.println("i = "+ i +" j = " + j);
        //Imprimimos suma despues de usar el operador *
        System.out.println("Multiplicacion = " + multiplicacion);

        //Ojo: Imprimimos usando el operador * para concatenacion,
        //pero  este operador ya no se puede realizar como + porque la concatenacion no lo reconoce


        //Ojo: Imprimimos usando el operador * para concatenacion pero le damos precedencia con los parentices
        System.out.println("i * j = " + (i * j));
        System.out.println("======================================================================");
    }

    private void dividir(){
        //declaramos variables
        int i = 4, j = 5, division = i / j;
        System.out.println("i = "+ i +" j = " + j);
        //Imprimimos suma despues de usar el operador +
        System.out.println("Division = " + division);

        //Ojo: Imprimimos usando el operador * para concatenacion,
        //pero  este operador ya no se puede realizar como + porque la concatenacion no lo reconoce


        //Ojo: Imprimimos usando el operador / para concatenacion pero le damos precedencia con los parentices
        System.out.println("i / j = " + (i / j));

        System.out.println("(float)i / (float)j = " + ((float)i / (float)j));
        System.out.println("======================================================================");
    }

    private void dividirResto(){
        //declaramos variables
        int i = 4, j = 5, dividirResto = i / j;
        System.out.println("i = "+ i +" j = " + j);
        //Imprimimos suma despues de usar el operador %
        System.out.println("Division = " + dividirResto);

        //Ojo: Imprimimos usando el operador % para concatenacion,
        //pero  este operador ya no se puede realizar como + porque la concatenacion no lo reconoce


        //Ojo: Imprimimos usando el operador / para concatenacion pero le damos precedencia con los parentices
        System.out.println("i % j = " + (i % j));

        System.out.println("(float)i % (float)j = " + ((float)i % (float)j));
        System.out.println("======================================================================");
    }
}
