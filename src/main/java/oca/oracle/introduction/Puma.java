package oca.oracle.introduction;

public abstract class Puma  implements HasTail {

    public int getTailLength() {
        return 4;
    }

    protected int getTailLength2() {
        return getTailLength() * 2;
    }

    protected abstract int getTailLength3();
}
