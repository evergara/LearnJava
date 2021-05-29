package operadores;

public class OperadoresPresedencia {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        new OperadoresPresedencia().presedencia();
    }

    private void presedencia() {
        int i = 14;
        int j= 8;
        int k = 20;

        double promedio = (i + j + k)/3d;
        System.out.println("promedio ( ("+i +"+"+ j +"+"+ k +")"+"/"+3d +") = " + promedio);

        promedio = (i + j + k)/3d * 10; //14 + 8 + 0.6
        System.out.println("promedio ( ("+i +"+"+ j +"+"+ k +")"+"/"+3d +" * 10) = " + promedio);
        promedio = i + j + k/3d;
        System.out.println("promedio ("+i +"+"+ j +"+"+ k +"/"+3d +") = " + promedio);

        promedio = ++i + j-- + k/3d;
        System.out.println("promedio (++"+i +"+"+ j +"-- +"+ k +"/"+3d +") = " + promedio);
    }
}
