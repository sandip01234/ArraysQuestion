import static java.lang.Math.max;
//count the maximum consecutive ones in an array:
public class q9 {
    public static void main(String[] args) {
        int maxcount=0;
        int[] arr={0,1,1,0,0,1,1,1,0};
        for(int i=0;i<arr.length;i++){
            int count=0;

            for (int j=i;j<arr.length;j++){
                if(arr[j]==1){
                    count++;
                }else {
                    break;
                }
            }
             maxcount=max(maxcount,count);
        }
        System.out.println(maxcount);
    }
}
