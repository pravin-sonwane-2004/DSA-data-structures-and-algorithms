
import java.util.Arrays;/*
//ive used bubble sort in it bubble sort what it does it checks j and
j+1 elements and this is brutforce code and this is more worst than bubble
bubble sorts time complexity is o(n^2) in worst case  , and o(n) in best case when array is sorted
but this is worst than anyone can think of its best and worst case time complexity is o(n^2)..
*/
public class SortAnArrayCalledBubbleNativeSort {
    public static void main(String[] args) {
    int [] arr = {5,2,6,4,9,8,2,3,20,2,0,62,0,5,9,8,77};
        System.out.println(Arrays.toString(returnReversed(arr)));

    }

    public static int [] returnReversed(int [] arr) {
        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr.length;j++){
                if(arr[i] < arr[j]) {
                   int temp =  arr[i];
                   arr[i] = arr[j];
                   arr[j]=temp;
                }
            }

        }
        return arr;
    }
}
