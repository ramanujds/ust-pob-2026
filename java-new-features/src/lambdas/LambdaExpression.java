package lambdas;

interface Printable {
    void print();

    default void scan() {
        System.out.println("Scanning data..");
    }
}

//class HpPrinter implements Printable{
//    public void print(){
//        System.out.println("Printing data...");
//    }
//}

interface Calculator {
    int calculate(int a, int b);
}

interface StringUpdater{
   String updateString(String str);
}

public class LambdaExpression {

    static void main() {

        // Create objects to make a string uppercase and lowercase

        StringUpdater toUpperCase = str -> str.toUpperCase();

        System.out.println(toUpperCase.updateString("Hello abc"));

        Printable obj = () -> System.out.println("Printing data...");

        obj.print();

        Calculator adder = (a, b) -> a + b;

        System.out.println(adder.calculate(10, 20));

        Calculator multiplier = (a, b) ->  a * b;

        Calculator gcdFinder = (a, b) -> {
            int gcd = 1;
            int min = a < b ? a : b;
            for (int i = 1; i <= min; i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
            return gcd;
        };

        System.out.println(gcdFinder.calculate(8,12));

    }

}
