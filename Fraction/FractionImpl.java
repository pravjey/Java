package fraction;

public class FractionImpl implements Fraction {

    int numerator;
    int denominator;

    /**
     * Parameters are the <em>numerator</em> and the <em>denominator</em>.
     * Normalize the fraction as you create it.
     * For instance, if the parameters are <pre>(8, -12)</pre>, create a <pre>Fraction</pre> with numerator
     * <pre>-2</pre> and denominator <pre>3</pre>.
     *
     * The constructor should throw an <pre>ArithmeticException</pre> if the denominator is zero.
     *
     * @param numerator+
     * @param denominator
     */
  public FractionImpl(int numerator, int denominator) {

      int num = numerator;
      int denom = denominator;
      int gcd = 1;
      int temp;
          
      try {
        temp = num / denom;
      } catch (ArithmeticException e) {
        System.out.println("Denominator cannot be zero");
    
      }
    
      gcd = findGCD(num, denom);
      this.numerator = num / gcd;
      this.denominator = denom / gcd;
          
  }

    /**
     * The parameter is the numerator and <pre>1</pre> is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
  public FractionImpl(int wholeNumber) {
      this.numerator = wholeNumber;
      this.denominator = 1;
  }

    /**
     * The parameter is a <pre>String</pre> containing either a whole number, such as `5` or `-3`, or a fraction,
     * such as "8/-12".
     * Allow blanks around (but not within) integers.
     * The constructor should throw an <pre>ArithmeticException</pre>
     * if given a string representing a fraction whose denominator is zero.
     * <p>
     * You may find it helpful to look at the available String API methods in the Java API.
     *
     * @param fraction the string representation of the fraction
     */
  public FractionImpl(String fraction) {
      String fracarray[] = fraction.split("\\");
      int numerator = Integer.parseInt(fracarray[0]);
      int denominator = Integer.parseInt(fracarray[1]);
      try {
          int temp = (numerator / denominator);
      } catch (ArithmeticException ext) {
          System.out.println("Denominator cannot be zero");
          return;
      }
      //this.numerator = numerator;
      //this.denominator = denominator;
      //}
      this.numerator = Integer.parseInt(fraction);
      this.denominator = 1;
      
  }

    private static int findGCD(int number1, int number2) { 
      if(number2 == 0) { 
        return number1; 
      } else {
        return findGCD(number2, number1%number2);
      } 
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        int a = this.numerator;
        int b = this.denominator;

        FractionImpl fr =  (FractionImpl)f;
  
        int c = fr.numerator;
        int d = fr.denominator;

        int numerator = (a * d) + (c * b);
        int denominator = b * d;

        Fraction g = new FractionImpl(numerator, denominator);
        return g;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        int a = this.numerator;
        int b = this.denominator;

        FractionImpl fr =  (FractionImpl)f;

        int c = fr.numerator;
        int d = fr.denominator;

        int numerator = (a * d) - (c * b);
        int denominator = b * d;

        Fraction g = new FractionImpl(numerator, denominator);
        return g;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        int a = this.numerator;
        int b = this.denominator;
        
        FractionImpl fr =  (FractionImpl)f;
  
        int c = fr.numerator;
        int d = fr.denominator;

        int numerator = (a * c);
        int denominator = (b * d);
        
        Fraction g = new FractionImpl(numerator, denominator);
        return g;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        int a = this.numerator;
        int b = this.denominator;
      
        FractionImpl fr =  (FractionImpl)f;
  
        int c = fr.numerator;
        int d = fr.denominator;

        int numerator = (a * d);
        int denominator = (b * c);
        Fraction g = new FractionImpl(numerator, denominator);
        return g;
    }
    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        int n1, d1;
        if ((this.numerator < 0) && (this.denominator >= 0)) {
            n1 = this.numerator * -1;
            d1 = this.denominator;
        } else if ((this.denominator < 0) && (this.numerator >=0)) {
            n1 = this.numerator;
            d1 = this.denominator * -1;
        } else if ((this.numerator < 0) && (this.denominator < 0)) {
            n1 = this.numerator * -1;
            d1 = this.denominator * -1;
        } else {
            n1 = this.numerator;
            d1 = this.denominator;
        }

        Fraction g = new FractionImpl(n1, d1);
        return g;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        int n1 = this.numerator * -1;
        int d1 = this.denominator;
        Fraction g = new FractionImpl(n1, d1);
        return g;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction inverse() {
        int temp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temp;

        Fraction g = new FractionImpl(this.numerator, this.denominator);

        return g;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {
        FractionImpl fr =  (FractionImpl)o;
        int x = this.numerator * fr.denominator - this.denominator * fr.numerator;

        if (x > 0) {
          return -1;
        } else if (x < 0) {
          return 1;
        } else {
          return 0;
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    public String toString() {
        if (this.denominator == 1) {
            return (this.numerator + "");
        } else if (this.denominator > 0) {
            return this.numerator + "/" + this.denominator;
        } else if (this.denominator == 0) {
            return "Divide by zero";
        } else { 
          this.numerator = this.numerator * -1;
          this.denominator = this.denominator * -1;
          return this.numerator + "/" + this.denominator;

        } 
    }
}
