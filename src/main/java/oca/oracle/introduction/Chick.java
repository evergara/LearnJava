package oca.oracle.introduction;

public class Chick {
    private String name = "Fluffy";

    { System.out.println("setting field"); }
    { System.out.println("setting field " + name); }

    public Chick() {
        this.name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }


}
