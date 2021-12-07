package estructuras_datos;

import java.util.Random;

public class ArreglesBoolean {
    public static void main(String[] args) {
        String[] selecionEsp = new String[]{"Iker","Puyol","Ramos", "Iniesta", "Villa"};
        boolean[] penaltis =  new boolean[5];
        Random rnd = new Random();

        for (int i = 0; i < penaltis.length; i++) {
            System.out.println("Se prepara para patear ... " + selecionEsp[i]);
            //Randon 1 or 0
            int numero = rnd.nextInt(2);
            penaltis[i] = numero == 0? false : true;

            if(penaltis[i]){
                System.out.println("Gooooooooollll");
            }else {
                System.out.println("ha errado");
            }

        }
    }
}
