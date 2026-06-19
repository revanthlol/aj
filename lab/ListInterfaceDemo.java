//Program to demonstrate the List interface and its methods
import java.util.*;

public class ListInterfaceDemo {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        arrayList.add(1, "Mango");

        System.out.println("List: " + arrayList);

        System.out.println("Element at index 2: " + arrayList.get(2));

        System.out.println("Contains Cherry? " + arrayList.contains("Cherry"));

        System.out.println("Size: " + arrayList.size());

        arrayList.remove("Banana");
        System.out.println("After removing Banana: " + arrayList);

        System.out.println("Is Empty? " + arrayList.isEmpty());

        List<String> extra = new ArrayList<>();
        extra.add("Grapes");
        extra.add("Kiwi");

        arrayList.addAll(extra);
        System.out.println("After addAll(): " + arrayList);

        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("LinkedList: " + linkedList);

        List<String> vector = new Vector<>();

        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");

        System.out.println("Vector: " + vector);

        arrayList.clear();
        System.out.println("\nArrayList after clear(): " + arrayList);
    }
}