package oca.oracle.introduction;

public class error {

    public static void main(String[] args) {
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        }
        /**
        catch (IllegalArgumentException e){
            System.out.print("<c>");
        }**/
        catch (RuntimeException e){
            System.out.print("<cc>");
        }
        catch (Exception e){
            System.out.print("<c2>");
        }
        finally {
            System.out.print("d");
        }
        System.out.print("E");

    }
}
