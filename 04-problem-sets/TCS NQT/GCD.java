class GCD {
  void main() {
    IO.println(retGCD(18,12
    ));
  }
  private static int retGCD(int a , int b) {
  if(b==0) return a;
  return retGCD (b,b%a);
}

  private static int gcd(int a,int b) {
    while(b!=0) {
      int rem = a%b;
      a = b;
      b = rem;
    }
    return a;
  }
}

