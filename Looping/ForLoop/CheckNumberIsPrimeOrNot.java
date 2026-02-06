

public class CheckNumberIsPrimeOrNot {
    public static void main (String [] args) {
        int n = 17;

//        boolean isPrime = true;
//        for(int i=2; i<n; i++){
//            if(n % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//        System.out.println(isPrime ? "Prime" : "Not Prime");
//    }
//        boolean isPrime = true;
//        int count = 1;
//        for(int i=2; i<n/2; i++){
//            if(n % i == 0) {
//                isPrime = false;
//                break;
//            }
////            count++;
//            System.out.println(count);
//
//        }
//        System.out.println(isPrime ? "Prime" : "Not Prime");
//    }
//
//        boolean isPrime = true;
//        int count = 0;
//        for(int i=2; i*i<=n; i++){
//            if(n % i == 0) {
//                isPrime = false;
//                break;
//            }
//            count++;
//            System.out.println(count);
//        }
//        System.out.println(isPrime ? "Prime" : "Not Prime");
//    }

        //this is optimal solution s far
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
    }
