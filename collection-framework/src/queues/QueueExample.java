package queues;

import java.util.*;

public class QueueExample {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Deque<String> myQueue = new ArrayDeque<>();

        System.out.println("Enter a number and a String:");
        int num = sc.nextInt();
        String str =  sc.nextLine();

        System.out.println("Num : "+num+"  |  Str : "+str);

        // ATM
        myQueue.push("Vamsi");
        myQueue.push("Kavi");
        myQueue.push("Rinu");
        myQueue.push("Rohan");

//        while (!myQueue.isEmpty()){
//            String current = myQueue.poll();
//            System.out.println(current);
//        }

    }

}
