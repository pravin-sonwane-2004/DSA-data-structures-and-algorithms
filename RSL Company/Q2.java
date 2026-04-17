// Q2. Write a Java program to find the maximum sum of a subarray where you are allowed to delete at 
// most one element. 
// Description 
// • You can choose a continuous subarray.  
// • You may delete one element from the subarray to maximize the sum.  
// • If all elements are negative, return the maximum element.  
// Input :- arr = [1, -2, 0, 3] 
// Output :- 4

// public class Q2 {
//     public static void main(String[] args) {
//         int[] arr = {1, -2, 0, 3};

//         int noDelete = arr[0];
//         int oneDelete = arr[0];
//         int ans = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             oneDelete = Math.max(noDelete, oneDelete + arr[i]);
//             noDelete = Math.max(arr[i], noDelete + arr[i]);

//             ans = Math.max(ans, Math.max(noDelete, oneDelete));
//         }

//         System.out.println(ans);
//     }
// }

public class Q2 {
        void main() {
            int arr[] = {5, -100, 6};
            int sum = 0;
            int max = 0;
            int largest =0;
            int l = 0;
           for(int i=0;i<arr.length;i++) {
            sum+= arr[i];
            max = Math.max(max, sum);
            largest = Math.max(largest, max+sum);
           }
           IO.print(largest);
        }
}
