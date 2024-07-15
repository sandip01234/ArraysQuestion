//Find the largest element in an array:
public class q1 {
    public static  void  main(String[] args){
        int[] arr={69,86,75,34};
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        System.out.println("The largest elements is:"+temp);
    }
}
