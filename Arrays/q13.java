//Find the majority Element in an array:
//this is the minimal solution :
public class q13 {
    public static void main(String[] args) {
        int[] arr={2,2,1,3,1,2,2};
        int majority =arr[0];
        int vote=1;
        for(int i=1;i<arr.length;i++){
            if(vote==0){
                vote++;
                majority=arr[i];

            }else if(majority == arr[i]){
                vote++;

            }else {
                vote--;

            }
        }
        System.out.println(majority);
    }
}// Another approach could be just sort the array and
// the middle one is the most repeated ones as ceiling(n/2)
// gives the required number:
