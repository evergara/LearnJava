package classwrapper;

import java.lang.reflect.Method;

public class EmeploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal";

        Class strClass = texto.getClass();

        System.out.println("strClass.getName() " +strClass.getName());
        System.out.println("strClass.getSimpleName() " +strClass.getSimpleName());
        System.out.println("strClass " +strClass);
        
        for (Method method: strClass.getMethods()){
            System.out.println("method.getName() = " + method.getName());
        }

        Integer num = 35;
        Class intClass = num.getClass();
        Class objectClass = intClass.getSuperclass().getSuperclass();

        System.out.println("intClass.getName() " +intClass.getName());
        System.out.println("intClass.getSimpleName() " +intClass.getSimpleName());
        System.out.println("intClass " +strClass);
        System.out.println("objectClass " +objectClass);



        for (Method method: objectClass.getMethods()){
            System.out.println("method.getName() = " + method.getName());
        }

    }
}
