//Program to show various methods using Collection Algorithm
import java.util.*;
public class CollectionAlgorithmDemo {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5, 6 , 3, 7, 8, 4));

		System.out.println("Original list: " + numbers);

		Collections.sort(numbers);
		System.out.println("Sorted list: " + numbers);

		Collections.reverse(numbers);
		System.out.println("Reversed list: " + numbers);

		Collections.shuffle(numbers);
		System.out.println("Shuffled list: " + numbers);

		System.out.println("Max: " + Collections.max(numbers));
		System.out.println("Min: " + Collections.min(numbers));
		System.out.println("Frequency of 5: " + Collections.frequency(numbers, 5));

		Collections.sort(numbers);
		System.out.println("Binary search for 5: index " + Collections.binarySearch(numbers, 5));

        Collections.swap(numbers, 0, numbers.size() - 1);
        System.out.println("List after swapping first and last elements: " + numbers);

        Collections.rotate(numbers, 5);
        System.out.println("List after rotating by 5 positions: " + numbers);

        Collections.copy(numbers, Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("List after copying: " + numbers);
	}
}
