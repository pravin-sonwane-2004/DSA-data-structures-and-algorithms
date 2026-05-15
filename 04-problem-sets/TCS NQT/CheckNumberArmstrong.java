public class CheckNumberArmstrong {
    void main() {
      for(int i = 0;i<1000;i++) {
         if(makeQubeOfDigit(i)){
          IO.println(i);
         }
      }
    }
    boolean makeQubeOfDigit(int n) {
      int origional = n;
      int sum=0;
      while(n>0) {
        int digit = n%10;
        sum+= digit*digit*digit;
        n=n/10;
      }
      return sum == origional;
    }
}
