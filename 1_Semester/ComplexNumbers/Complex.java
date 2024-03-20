import java.lang.Math;
public class Complex {
    public double imaginary;
    public double real;

    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     *
     * @param other bekommt eine andere komplexe Zahl als Parameter
     *
     * @return gibt die Addition der beiden komplexen Zahlen als komplexe Zahl zurück
     */
    public Complex add(Complex other) {
        double tempReal = this.real + other.real;
        double tempImaginary = this.imaginary + other.imaginary;
        return new Complex(tempReal, tempImaginary);
    }

    public Complex sub(Complex other) {
        double tempReal = this.real - other.real;
        double tempImaginary = this.imaginary - other.imaginary;
        return new Complex(tempReal, tempImaginary);
    }

    public Complex mul(Complex other) {
        double tempReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double tempImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(tempReal, tempImaginary);
    }

    public Complex div(Complex other) {
        double tempReal = ((this.real * other.real + this.imaginary * other.imaginary) / (other.real * other.real + other.imaginary * other.imaginary));
        double tempImaginary = ((this.imaginary * other.real + this.real * other.imaginary) / (other.real * other.real + other.imaginary * other.imaginary));
        return new Complex(tempReal, tempImaginary);
    }

    public String toString() {
        if (this.imaginary == 0) {
            return " " + this.real;
        } else {
            return " " + this.real + " + " + this.imaginary + "i";
        }
    }

    public boolean equals(Complex other) {
        if (Math.abs(this.real - other.real) < 0.000001 && Math.abs(this.imaginary - other.imaginary) < 0.000001)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}//runden