

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.


class MergeTwoArraysInAscending {

    //  public void merge(int[] nums1, int m, int[] nums2, int n) { 
    //     int leng = m-n; //leng = 6-3
    //     int secpointer = 0; //0
    //     for(int i=0;i<n;i++) {  //0<6
    //             nums1[leng++] = nums2[secpointer++]; //
    //     }
     

    //     for(int i = 0;i<m-1;i++) {  //0<5
    //         for(int j=i+1;j<m;j++) {  //1
    //             if(nums1[j] < nums1[i]) {  //1 > 0
    //                 int temp = nums1[i];   //0
    //                 nums1[i] = nums1[j];  //1
    //                 nums1[j] = temp;
    //             }
    //         }
    //     }
    //     for (int k : nums1) {
    //         System.out.println(k);
    //     }
    //  }


    //i have not done this by myself
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;   //5
    int j = n - 1;  //2
    int k = m + n - 1;  //7

    while (i >= 0 && j >= 0) { // 5>0 && 2>
        if (nums1[i] > nums2[j]) {
            nums1[k--] = nums1[i--];
        } else {
            nums1[k--] = nums2[j--];
        }
    }

    while (j >= 0) {
        nums1[k--] = nums2[j--];
    }
}

    void main() {
        int [] nums1 = {1,2,3,0,0,0};
        int []  nums2 = {2,5,6};
        MergeTwoArraysInAscending obj = new MergeTwoArraysInAscending();
        obj.merge(nums1,nums1.length,nums2,nums2.length);
    }
}