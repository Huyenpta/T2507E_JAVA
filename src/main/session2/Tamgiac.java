package main.session2;

public class Tamgiac {
    Integer a;
    Integer b;
    Integer c;

    public Tamgiac() {

    }

    public Tamgiac(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Integer chuVi() {
        return a + b + c;
    }

    public Double dienTich() {
        double p = (double) chuVi() / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}
