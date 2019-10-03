package es.upm.miw.iwvg.ecosystem.practice;

public class Fraction {
    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public boolean isPropia() {
        return this.numerator <= this.denominator;
    }

    public boolean equivalent(Fraction otherFraction) {
        int product1 = this.numerator*otherFraction.getDenominator();
        int product2 = this.denominator*otherFraction.getNumerator();
        if (product1 == product2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMayor(Fraction otherFraction) {
        double parte1 = (double) this.numerator/this.denominator;
        double parte2 = (double) otherFraction.getNumerator()/otherFraction.getDenominator();
        return parte1 > parte2;
    }

}
