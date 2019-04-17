
import fraction.FractionImpl;
import fraction.Fraction;

// This file is a used to test the Fraction package

public class Main {

    public static void main(String[] args) {

        FractionImpl a = new FractionImpl(20, 40);
        Fraction b = new FractionImpl(60, 80);
        Fraction c = new FractionImpl(60);
        Fraction d = new FractionImpl(60, 0);
        Fraction e = new FractionImpl(60, 61);
        Fraction f = new FractionImpl(0, 61);
        Fraction g = new FractionImpl(-1, 61);
        Fraction h = new FractionImpl(1, -61);

        System.out.println("Fraction a: " + a);
        System.out.println("Fraction b: " + b);
        System.out.println("Fraction c: " + c);
        System.out.println("Fraction d: " + d);
        System.out.println("Fraction e: " + e);
        System.out.println("Fraction f: " + f);
        System.out.println("Fraction g: " + g);
        System.out.println("Fraction h: " + h);
        
        System.out.println("Addition a + b: " + a.add(b));
        System.out.println("Subtraction a - b: " + a.subtract(b));
        System.out.println("Multiplication a * b: " + a.multiply(b));
        System.out.println("Division a \\ b: " + a.divide(b));
        System.out.println("Absolute of g: " + g.abs());
        System.out.println("Negation of e: " + e.negate());
        System.out.println("Negation of h: " + h.negate());
        System.out.println("Inverse of e: " + e.inverse());
        System.out.println("Inverse of f: " + f.inverse());
        System.out.println("Comparing a and b: " + a.compareTo(b));
        System.out.println("Comparing b and a: " + b.compareTo(a));
        System.out.println("Comparing a and a: " + a.compareTo(a));
        System.out.println("Comparing a and 5/10: " + a.compareTo(new FractionImpl(5, 10)));
        Fraction m = new FractionImpl(5, 10).negate();
        System.out.println("Comparing a and -5/10: " + a.compareTo(m));
        System.out.println("toString a " + a.toString());
        System.out.println("toString g " + g.toString());

    }
}
