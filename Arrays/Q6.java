// linear search:


package q6;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        int[] arr={4,3,5,2,5,6};
        boolean found=false;
        Scanner scanner= new Scanner(System.in);
        int key= scanner.nextInt();
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println("Element is found on " +i+ "Index");
                found =true;

            }
        }
if(!found) System.out.println("the element is not found in the array");
    }
}
