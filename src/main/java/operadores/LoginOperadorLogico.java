package operadores;

import java.util.Scanner;

public class LoginOperadorLogico {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        LoginOperadorLogico loginOperadorLogico = new LoginOperadorLogico();
        loginOperadorLogico.login();
        loginOperadorLogico.loginArreglo();
        loginOperadorLogico.loginArreglo2();
    }

    private void loginArreglo2() {
        String[] usersNames = {"admin", "administrador"};
        String[] passwords = {"pass", "pass"};

        boolean esAutenticado = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese usuario: ");
        String u = scanner.next();

        System.out.println("Ingrese contraseña: ");
        String p = scanner.next();

        for (int i = 0; i < usersNames.length; i++) {
            if(usersNames[i].equalsIgnoreCase(u) && passwords[i].equalsIgnoreCase(p)){
                esAutenticado = true;
                break;
            }
        }


        if(esAutenticado){
            System.out.println("Acceso permitido ...");
        }else{
            System.out.println("Acceso denegado");
        }
    }

    private void loginArreglo() {
        String[] usersNames = new String[2];
        String[] passwords = new String[2];

        usersNames[0] = "admin";
        usersNames[1] = "administrador";

        usersNames[0] = "pass";
        passwords[1] = "pass";

        boolean esAutenticado = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese usuario: ");
        String u = scanner.next();

        System.out.println("Ingrese contraseña: ");
        String p = scanner.next();

        for (int i = 0; i < usersNames.length; i++) {
            if(usersNames[i].equalsIgnoreCase(u) && passwords[i].equalsIgnoreCase(p)){
                esAutenticado = true;
                break;
            }
        }


        if(esAutenticado){
            System.out.println("Acceso permitido ...");
        }else{
            System.out.println("Acceso denegado");
        }
    }

    private void login() {
        String user = "admin";
        String pass = "pass";
        boolean esAutenticado = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese usuario: ");
        String u = scanner.next();

        System.out.println("Ingrese contraseña: ");
        String p = scanner.next();

        if(user.equalsIgnoreCase(u) && pass.equalsIgnoreCase(p)){
            esAutenticado = true;
        }

        if(esAutenticado){
            System.out.println("Acceso permitido ...");
        }else{
            System.out.println("Acceso denegado");
        }
    }
}
