
import java.util.*;

public class Main {
    public static void main (String [] args) {
       int [] arr ={7, 7, 7, 5};
       int firstLargest = Integer.MIN_VALUE;
       int secondLargest =  Integer.MIN_VALUE;
       for(int i =0;i<arr.length;i++) {
           if(arr.length < 2) {
                return;
           }
           if(arr[i] > firstLargest) {
               int temp = firstLargest;
               firstLargest = arr[i];
               secondLargest = temp;
               System.out.println(secondLargest);
           }
           else if(arr[i]>secondLargest && arr[i] !=firstLargest) {
               secondLargest=arr[i];
           }
       }


    }
}
