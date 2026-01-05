package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    static void main() {


        List<Integer> nums = Arrays.asList(6,3,2,1,5,7);


        // Find/Search/Filter - filter()
        // Stream<Integer> stream = Stream.of(1,3,2,6,4,5);

        nums.stream().filter(n -> n%2!=0).forEach(n-> System.out.print(n+" "));
        System.out.println();
        nums.stream().filter(n -> n%2==0).forEach(n-> System.out.print(n+" "));
        System.out.println();

        // Changes/Update - map()

        // nums.stream().map(n->n*2).forEach(n-> System.out.print(n+" "));

        // Collect to a Collection - collect()

        List<Integer> evens = nums.stream().filter(n -> n%2==0).toList();

        // Covert to a single output - reduce()

        // add all the evens

        int sunEvens = nums.stream().filter(n -> n%2==0).reduce(0,(x,y)->x+y);
        System.out.println(sunEvens);

        // Joining Strings - joining()

        List<String> names = Arrays.asList("Gokul","Kavi","Rinu","Rohan");

        String output = names.stream().map(s->s.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(output);

        // Optional

        String name = names.stream().filter(s->s.equals("Rinu")).findFirst().get();


        List<Integer> list = Arrays.asList(2,6,8,4,10);

        // Get the first odd number

        int num = list.stream().filter(n->n%2!=0).findFirst().orElse(-1);
        System.out.println(num);

    }

}
