package Chapter9;

public class LinearEquation { // question 11

    private int a;private int b;private int c;
    private int d;private int e;private int f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() {
        if ((this.a * this.d) - (this.b * this.c) == 0) {
            System.out.println("The equation has no solution");
            return false;
        }

        return true;
    }

    public int getX() {
        return ((this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c));
    }

    public int getY() {
        return ((this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c));
    }

    //setters below

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setE(int e) {
        this.e = e;
    }

    public void setF(int f) {
        this.f = f;
    }
}
