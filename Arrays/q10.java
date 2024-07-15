//Merge two sorted array:
public class q10 {
    public static void main(String[] args) {
        int[] arr1={ 1,2,4,5};
        int[] arr2={4,5,6,7};
        int size= arr1.length+arr2.length;
        int[] finalarr= new int[size];
        int k=0,i=0,j=0;
        while(i<arr1.length &&  j<arr2.length){
            if(arr1[i]<arr2[j]){
                finalarr[k]=arr1[i];
                i++;k++;

            }else{
                finalarr[k]=arr2[j];
                j++; k++;

            }
        }
        while ( i<arr1.length){
            finalarr[k++]= arr1[i++];
        }
        while ( j<arr2.length){
            finalarr[k++]= arr2[j++];
        }
       for ( i=0;i<finalarr.length;i++){
           System.out.print(finalarr[i]+",");
       }
    }
}
