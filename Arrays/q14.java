// two sum problem using hashmap:
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value to be searched:");
        int key = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = key - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("Pair found at indices: " + map.get(complement) + " and " + i);
                break; // Exit the loop after finding the first pair
            }
            map.put(arr[i], i);
        }
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
