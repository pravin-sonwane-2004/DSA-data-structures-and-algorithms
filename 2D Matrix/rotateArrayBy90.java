public class rotateArrayBy90 {
    void main() {
        int arr [][] = new int [][] {
            {1,2},
            {3,4}
        };
        int n = arr.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                IO.println(arr[i][j]);
            }
        }
    }

}
