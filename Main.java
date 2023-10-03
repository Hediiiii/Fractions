class Main {
    public static void main(String[] args) {
       //System.out.println("fraction\n");
        Fraction fraction = new Fraction(12,3);
        String res  = fraction.toString();
        System.out.println(res);

        Fraction frac1 = new Fraction(12,3);
         assert frac1.toString().equals("12/3");


        Fraction frac2 = new Fraction(12);
         assert frac2.toString().equals("12/1");


        Fraction frac3 = new Fraction();
         assert frac3.toString().equals("0/1");

        Fraction frac_double = new Fraction(3, 4);
         assert frac_double.doubleValue() == 0.75;

    }
}