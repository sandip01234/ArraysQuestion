// Identify the number that array has once:
public class q11 {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,2,4,3};
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res= res^arr[i];//xor give not reapeated numbers:

        }
        System.out.println(res);
    }
}
