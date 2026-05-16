public class FindFactorial {
    void main() {
      for(int i=0;i<10;i++) {
        IO.println(i+ "->"+findFactorial(i)); // integer overflow we need to use here Long 
      }
    }
    // int findFactorial(int n) {
    //     int factorial = 1;
    //     for(int i=n;i>0;i--) {
    //         factorial *= i;
    //     }
    //     return factorial;
    // }
    long findFactorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("Factorial is not defined for negative numbers");
    }

    long factorial = 1;

    for (int i = n; i > 0; i--) {
        factorial *= i;
    }

    return factorial;
}
}
