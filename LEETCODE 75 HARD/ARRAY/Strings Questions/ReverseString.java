

public class ReverseString {
    public static void main(String[] args) {
        String s = "Pravin";
        String d = reverse(s);
        System.out.println(d);

    }

    public static String reverse (String s) {
        char [] arr = s.toCharArray();
        int right = arr.length-1;
        int left = 0;
        for(int i=0;i<arr.length;i++) {
            if(left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}