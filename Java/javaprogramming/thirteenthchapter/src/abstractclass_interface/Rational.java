package abstractclass_interface;

public class Rational extends Number implements Comparable<Rational> {
    
    /**
     *serialVersionUID有啥用不太懂
     *据说和版本控制有关
     */
    private static final long serialVersionUID = 1L;
    private long numerator;// 分子
    private long denominator;//分母

    public Rational(){
        this.denominator = 1;
        this.numerator   = 0;
    }

    public Rational(long numerator, long denominator){
        this.denominator= denominator;
        this.numerator  = numerator;
    }

    /**
     * @return the numerator
     */
    public long getNumerator() {
        return numerator;
    }

    /**
     * @return the denominator
     */
    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        long n = numerator * secondRational.getDenominator() +
          denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
      }
    
      /** Subtract a rational number from this rational */
      public Rational subtract(Rational secondRational) {
        long n = numerator * secondRational.getDenominator()
          - denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
      }
    
      /** Multiply a rational number to this rational */
      public Rational multiply(Rational secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
      }
    
      /** Divide a rational number from this rational */
      public Rational divide(Rational secondRational) {
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.numerator;
        return new Rational(n, d);
      }

      public static long gcd(long n , long d) {
            long a = Math.abs(n);
            long b = Math.abs(d);
            int gcd = 1;
            for(int i = 1; i<=a && i<=b ;i++){
                if(a%i==0 && b%i==0){

                    gcd = i;

                }
            }
            return gcd;
          
      }
        /**
         * 以上为Rational类本身具有的属性
         * 以下为继承父类后必须完善的抽象方法
         */
      @Override
      public int compareTo(Rational o) {
          long i = this.subtract(o).getNumerator();
          if(i>0) return 1;
          else if(i<0) return -1;
          else return 0;
      }

      @Override
      public int intValue() {
          return (int)doubleValue();
      }

      @Override
      public long longValue() {
          return (long) doubleValue();
      }

      @Override
      public float floatValue() {
          
          return (float) doubleValue();
      }

      @Override
      public double doubleValue() {
          return numerator*1.0 / denominator;
      }

     @Override
     public String toString(){
         if(denominator==1) return numerator+"";
         else return numerator + "/"+ denominator;
     }

}