package sentenciadecontrolbucles;

import java.util.Scanner;

public class SentenciaDeBucles {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        SentenciaDeBucles sb = new SentenciaDeBucles();
        sb.getWhile();
        sb.getDoWhile();
        sb.getFor();
    }



    private void getFor() {
        int num = getconsole();

        for (int i = 0; i< num; i++){
            displayMessage("En el ciclo for " + i);
        }
    }

    private void getDoWhile() {
        int num = getconsole();
        int band = 0;

        do {
            if(num == 0 ||  num<0){
                displayMessage("Por lo lo menos me ejecuto una vez");
            }
            displayMessage("en el ciclo Do while " + band);
            band++;
        }while (band < num );
    }

    private void getWhile() {
      int num = getconsole();
      int band = 0;
      while (band < num ){
          displayMessage("en el ciclo while " + band);
          band++;
      }
    }

    private void displayMessage(String message){
        System.out.println(message);
    }

    private int getconsole(){
        Scanner sc = new Scanner(System.in);
        displayMessage("Digite un numero ");
        return  sc.nextInt();
    }
}
