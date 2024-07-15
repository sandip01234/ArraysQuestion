// Determine if the array is sorted :
public class q3 {
    public  static void main(String[] args){
        int[] arr={1,2,3,5,3};
        if(issorted(arr)){
            System.out.println("The array is already sorted!");
        }else {
            System.out.println("The given array isn't sorted!");
        }
    }
    public static boolean issorted(int[] arr){
        for (int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
    return true;
    }

}
