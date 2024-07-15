//Identify leaders in an Array:
public class q16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3,9};
/////////// Naive approach::
//        for(int i=0; i<arr.length;i++){
//           boolean is_leader=true;
//            for (int j=i+1; j<arr.length;j++){
//                if(arr[j]>=arr[i]){
//                    is_leader=false;
//                    break;
//
//
//                }
//                }
//            if(is_leader){
//                System.out.print(arr[i]+" ");
//            }
//
//            }
        //optimed approach:
        int current_leader= arr[arr.length-1];
        System.out.print(current_leader);
        for(int i=arr.length-2;i>0;i--){
            if(arr[i]>current_leader){
                current_leader= arr[i];
                System.out.print(" "+current_leader+" ");
            }
        }
        }
    }

