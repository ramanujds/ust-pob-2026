public class MyExceptionDemo {

    static int getFactorial(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Negative Number Not Allowed");
        }
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }

    static void main() {

        int num = -5;

        try {
            System.out.println(getFactorial(num));
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }

    }

}
