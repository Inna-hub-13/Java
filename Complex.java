public class Complex implements Comparable<Complex>, Cloneable {

    private double realPart;
    private double imaginaryPart;


    public Complex() {

        this(0.0, 0.0);
    }

    public Complex(double realPart) {

        this(realPart, 0.0);
    }

    public Complex(double realPart, double imaginaryPart) {

        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getImaginaryPart() {

        return imaginaryPart;
    }

    public double getRealPart() {

        return realPart;
    }

    public Complex add(Complex complex) {

        double realPartRes = this.realPart + complex.realPart;
        double imaginaryPartRes = this.imaginaryPart + complex.imaginaryPart;

        return new Complex(realPartRes, imaginaryPartRes);
    }

    public Complex subtract(Complex complex) {

        double realPartRes = this.realPart - complex.realPart;
        double imaginaryPartRes = this.imaginaryPart - complex.imaginaryPart;

        return new Complex(realPartRes, imaginaryPartRes);
    }

    public Complex multiply(Complex complex) {

        double realPartRes = this.realPart * complex.realPart
                - this.imaginaryPart * complex.imaginaryPart;

        double imaginaryPartRes = this.imaginaryPart * complex.realPart
                + this.realPart * complex.imaginaryPart;

        return new Complex(realPartRes, imaginaryPartRes);
    }

    public Complex divide(Complex complex) {

        double realPartRes = (this.realPart * complex.realPart + this.imaginaryPart * complex.imaginaryPart)
        / (complex.realPart * complex.realPart + complex.imaginaryPart * complex.imaginaryPart);

        double imaginaryPart = (this.imaginaryPart * complex.realPart - this.realPart * complex.imaginaryPart)
                / (complex.realPart * complex.realPart + complex.imaginaryPart * complex.imaginaryPart);

        return new Complex(realPartRes, imaginaryPart);
    }

    public double abs() {

        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
    }


    @Override
    public String toString() {

        return imaginaryPart == 0 ? "" + realPart : realPart + " + " + imaginaryPart + "i";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Complex)
            return this.abs() == ((Complex) obj).abs();

        return false;
    }

    @Override
    public int compareTo(Complex complex) {

        if(this.abs() > complex.abs())
            return 1;
        else if(this.abs() < complex.abs())
            return - 1;
        else
            return 0;
    }

    @Override
    public Object clone() {

        try{

            return super.clone();
        }
        catch(CloneNotSupportedException e) {

            System.out.print(e);
            return null;
        }
    }
}
