import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        // Constructor
        HashSet<String> fruits = new HashSet<>();

        // add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("HashSet: " + fruits);

        // remove()
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // contains()
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // removeAll()
        HashSet<String> removeSet = new HashSet<>();
        removeSet.add("Apple");
        removeSet.add("Orange");

        fruits.removeAll(removeSet);
        System.out.println("After removeAll(): " + fruits);

        // clear()
        fruits.clear();
        System.out.println("After clear(): " + fruits);
    }
}
