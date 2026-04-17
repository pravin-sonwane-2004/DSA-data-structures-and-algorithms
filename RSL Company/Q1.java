// Q1. Write a Java program to find the minimum number of jumps required to reach the last index. 
// Description 
// • Each element represents maximum jump length  
// • If not reachable, return -1  
// Input :- arr = [2, 3, 1, 1, 4] 
// Output :- 2

public class Q1 {
    void main() {
        int arr [] = {2, 3, 1, 1, 4};
       
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {

            for(int j=0;j<arr[i];j++) {
                if(j==arr.length) {
                    min = Math.min(min,j);
                    break;
                }
            }
            IO.println(min);
        }
    }
}
