class RotateString{
  void main() {
    String s = "abcdef";   //6

      int k = 2;

        k = k % s.length();   // 2%6 =2

        String rotated = s.substring(k) + s.substring(0, k);

        System.out.println(rotated);
  }
}