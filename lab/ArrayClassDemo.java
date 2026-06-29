//Program to Implement Array Class
import java.util.*;
public class ArrayClassDemo {
	public static void main(String[] args) {
		int[] num = {5, 2, 9, 1, 6};
		System.out.println("Original array: " + Arrays.toString(num));

		int[] sorted = num.clone();
		Arrays.sort(sorted);
		System.out.println("Sorted array:   " + Arrays.toString(sorted));
        
		int key = 6;
		int pos = Arrays.binarySearch(sorted, key);
		if (pos >= 0) 
            System.out.println("Value " + key + " found at index " + pos + " in the sorted array.");
		else 
            System.out.println("Value " + key + " not found.");
        


	}
}
