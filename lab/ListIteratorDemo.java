//Program to implement to access elements of a collection in both forward and backward direction using ListIterator
import java.util.*;
class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("List: " + list);

        ListIterator<String> iterator = list.listIterator();

        System.out.println("\nForward Traversal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nBackward Traversal:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}