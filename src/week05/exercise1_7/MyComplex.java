package week05.exercise1_7;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getImag() {
        return imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append(this.real)
                .append(" + ")
                .append("i")
                .append(this.imag);
        return description.toString();
    }

    public boolean isReal() {
        if (Double.compare(this.imag, 0.0) == 0) {
            return true;
        }

        return false;
    }

    public boolean isImaginary() {
        if (Double.compare(this.real, 0.0) == 0) {
            return true;
        }

        return false;
    }

    public boolean equals(double real, double imag) {
        if ((Double.compare(this.real, real) == 0)
            && (Double.compare(this.imag, imag) == 0)) {
            return true;
        }

        return false;
    }

    public boolean equals(MyComplex right) {
        if ((Double.compare(this.real, right.real) == 0)
                && (Double.compare(this.imag, right.imag) == 0)) {
            return true;
        }

        return false;
    }

    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex.real = this.real + right.real;
        newComplex.imag = this.imag + right.imag;
        return newComplex;
    }
}
