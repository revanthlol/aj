// Program to demonstrate differences between Set interface classes: HashSet, LinkedHashSet, and TreeSet

import java.util.*;

public class SetInterfaceDemo {
    public static void main(String[] args) {

        // HashSet
        Set<String> hashSet = new HashSet<>();
        
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Cherry");
        hashSet.add("Apple");
        hashSet.add(null);
        System.out.println("HashSet:" + hashSet);
        System.out.println("Allows one null value");
        System.out.println("Order is NOT guaranteed");
        System.out.println("Duplicates are ignored");

        // LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple");
        linkedHashSet.add(null);

        System.out.println("LinkedHashSet:" + linkedHashSet);
        System.out.println("Maintains insertion order");
        System.out.println("Allows one null value");
        System.out.println("Duplicates are ignored");


        // TreeSet
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Apple");

        System.out.println("TreeSet:" + treeSet);
        System.out.println("Elements are automatically sorted");
        System.out.println("Does NOT allow null values");
        System.out.println("Duplicates are ignored");
    }
}