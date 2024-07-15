import java.util.Scanner;
//find the missing number in the array:

public class q8 {
    public static void main(String[] args) {


      int[] arr={1,2,3,5,6};
      int size=arr.length+1;
        int sum=0;


        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        int nsum=(size*(size+1))/2;
        int missingnum= nsum-sum;
        System.out.println(missingnum);

    }
}
