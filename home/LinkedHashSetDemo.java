import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        // Constructor
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        // add()
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("LinkedHashSet: " + numbers);

        // remove()
        numbers.remove(20);
        System.out.println("After removing 20: " + numbers);

        // contains()
        System.out.println("Contains 30? " + numbers.contains(30));

        // removeAll()
        LinkedHashSet<Integer> removeNumbers = new LinkedHashSet<>();
        removeNumbers.add(10);
        removeNumbers.add(40);

        numbers.removeAll(removeNumbers);
        System.out.println("After removeAll(): " + numbers);

        // clear()
        numbers.clear();
        System.out.println("After clear(): " + numbers);
    }
}
