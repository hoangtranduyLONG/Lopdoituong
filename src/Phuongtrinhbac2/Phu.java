package Phuongtrinhbac2;

public class Phu {
    private int a, b, c;

    public Phu(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getDiscriminant() {
        return b*2 - 4*a*c;
    }

    public int getRoot() {
        return -b/(2*a);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(b*b - 4*a*c))/2*a;
    }

    public double getRoot2() {
        return (-b - Math.sqrt(b*b - 4*a*c))/2*a;
    }
}
