public class MajorityElements {
    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int votes = 0;

        for (int num : nums) {

            if (votes == 0) {
                candidate = num;
            }

            votes += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    void main() {
        int arr[] = {1,2,3,3,4,5,7};
        IO.println(majorityElement(arr));
    }
}