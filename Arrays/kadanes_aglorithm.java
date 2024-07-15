//Find the longest subarray in a array of sum k:
public class kadanes_aglorithm {
    public static void main(String[] args) {
        int[] arr={-2,-5,6,-2,-3,1,5,-6};
        int max=arr[0];
        int curr_max=arr[0];
        for(int i=1;i<arr.length;i++){
            curr_max= Math.max(arr[i],arr[i]+curr_max);
            max=Math.max(curr_max,max);

        }
        System.out.println(max);
    }
}
