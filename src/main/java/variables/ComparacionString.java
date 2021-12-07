package variables;

public class ComparacionString {
    public static void main(String[] args) {
        String lang = "Java";

        boolean sonIguales = true;
        boolean conmparacionBolean = true == true; // los boolean se pueden comparara con ==
        boolean conmparacionEntero = 4 == 4; // los enteros se pueden comparara con ==
        boolean esJava = lang.equals("java"); // los String se  comparan  con equals porque son objetos

        System.out.println("esJava = " + esJava);

        esJava = lang.equalsIgnoreCase("java");

        System.out.println("esJava = " + esJava);

        
    }
}
