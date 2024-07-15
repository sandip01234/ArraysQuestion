//right rotate an array by k position:
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        int[] nums={2,5,6,7,2,3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of K:");
        int k= scanner.nextInt();
    reverse(nums,0, nums.length-1);//full array reverse
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        for (int num : nums) {
            System.out.print(num+",");
        }


    }
    public static void reverse(int[] nums, int start,int end){
        while(start<end){
            int temp= nums[start];
             nums[start]=nums[end];
             nums[end]=temp;
             start++;
             end--;

        }
    }
}
