# Predict the output

Predict the output of the following Java code snippet.

```java
public class Main {
    public static void main(String[] args) {
        String contactinfo = "Bob, India";

        if (contactinfo.endsWith("India")) {
            if (contactinfo.contains("Joe")) {
                System.out.println("Your name is Joe");
            } else if (contactinfo.contains("Mina")) {
                System.out.println("Your name is Mina");
            } else {
                System.out.println(contactinfo.split(",")[0]);
            }
        } else {
            System.out.println("You do not have a name");
        }
    }
}

```

## What will the following code produce when executed?

```java

class Student {

    public int marks;

}


class sample {

    public static void main(String[] args) throws java.lang.Exception {

        Student s = new Student();

        System.out.println(s.marks);

    }

}

```

## Question : You want to sort an array arr such that the sorted array contains the first element as first maximum in arr and second element is first minimum in arr and so on. You are using the following pseudocode to achieve this.

1. Sort the array arr in ascending order.
2. Initialize two pointers, one at the start (left) and one at the end (right) of the sorted array.
3. Create an empty result array to store the rearranged elements.
4. While left pointer is less than or equal to right pointer, do the following:
   a. If left pointer is equal to right pointer, add arr[left] to the result array.
   b. Else, add arr[right] to the result array followed by arr[left].
   c. Increment the left pointer and decrement the right pointer.

## What is the result displayed by the given pseudocode?

```java

main() {

    declare k = 0, i = 1, j = 1, n = 6;

    declare a = 0, d = 0, f = 0;


    for (d = 0; d < n; d++) {

        k = i + j;

        i = j;

        j = k;

        f += f + k;

    }


    while (f > 0) {

        a = f % 10;

        f = f / 10;

    }


    print(a);

}

```

