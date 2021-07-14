package oca.oracle.introduction;

public class Cougar extends Puma {
    public static void main(String[] args) {
        Cougar cougar = new Cougar();
        System.out.println(cougar.getTailLength3());
    }

    @Override
    protected int getTailLength3() {
        return getTailLength2()*4;
    }
}
