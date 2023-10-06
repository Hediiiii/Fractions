public class Main{
    public static void main(String[] args) {
        Fractions num1 = new Fractions(20, 1);
        Fractions num2 = new Fractions(20, 3);
        final Fractions ZERO = new Fractions();
        final Fractions UN = new Fractions(1);
        Fractions res = num1.add(num2);
        num1.test_egal(num2);
        System.out.println(num2.doublevalue());
    }

}