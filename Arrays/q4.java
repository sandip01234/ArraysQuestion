//Remove the duplicate from a sorted array:
public class q4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5};
        int j = 0;

        // Use a separate index to store the position of the last unique element
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length - 1]; // Add the last element as it is always unique

        // Print the array without duplicates
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
