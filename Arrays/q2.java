//Identify the second largest element in an Array:
public class q2 {
    public  static  void main(String[] args){
        int[] arr={69,86,75,34};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        System.out.println("the second largest element is "+ second);

            }

        }


