package streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

    static void main() {


        List<Integer> nums = Arrays.asList(6,3,2,1,5,7);

        // filter out all the evens then make the square and then get the sum

        int sum = nums.stream().filter(n->n%2==0).mapToInt(n->n*n).sum();
        System.out.println(sum);

    }

}
