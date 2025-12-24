package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ListExample {

    static void main() {

        List<Integer> items = new ArrayList<>();

        items.add(10);
        items.add(100);
        items.add(500);
        items.add(100);
        items.add(2,800);

        items.remove((Object)10);

//       for(int item:items){
//           System.out.println(item);
//       }

//        items.forEach(System.out::println);





    }

}
