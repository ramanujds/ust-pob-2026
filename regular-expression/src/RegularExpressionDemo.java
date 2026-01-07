import java.util.regex.Pattern;

public class RegularExpressionDemo {

    static void main() {

        String pattern = "^[a-z]+[A-Z]+[0-9]+$";

        String input = "aGaG10";

        var test = Pattern.matches(pattern,input);

        System.out.println(test);


    }

}
