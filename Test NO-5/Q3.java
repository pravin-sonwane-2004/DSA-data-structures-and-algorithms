import java.util.Scanner;

class PrimeArrayManager {
    private int[] arr;
    private int[] primes;
    private int[] nonPrimes;
    private int[] merged;
    private int pCount = 0, npCount = 0;

    public PrimeArrayManager(int[] array) {
        this.arr = array;
        this.primes = new int[array.length];
        this.nonPrimes = new int[array.length];
        this.merged = new int[array.length];
        separateNumbers();
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private void separateNumbers() {
        for (int num : arr) {
            if (isPrime(num)) {
                primes[pCount++] = num;
            } else {
                nonPrimes[npCount++] = num;
            }
        }
    }

    public void sortPrimesAscending() {
        for (int i = 0; i < pCount - 1; i++) {
            for (int j = 0; j < pCount - i - 1; j++) {
                if (primes[j] > primes[j + 1]) {
                    int temp = primes[j];
                    primes[j] = primes[j + 1];
                    primes[j + 1] = temp;
                }
            }
        }
    }

    public void sortNonPrimesDescending() {
        for (int i = 0; i < npCount - 1; i++) {
            for (int j = 0; j < npCount - i - 1; j++) {
                if (nonPrimes[j] < nonPrimes[j + 1]) {
                    int temp = nonPrimes[j];
                    nonPrimes[j] = nonPrimes[j + 1];
                    nonPrimes[j + 1] = temp;
                }
            }
        }
    }

    public void mergeArrays() {
        int idx = 0;
        for (int i = 0; i < pCount; i++) merged[idx++] = primes[i];
        for (int i = 0; i < npCount; i++) merged[idx++] = nonPrimes[i];
    }

    public void display() {
        System.out.print("Prime Numbers: ");
        for (int i = 0; i < pCount; i++) System.out.print(primes[i] + " ");
        
        System.out.print("\nNon Prime Numbers: ");
        for (int i = 0; i < npCount; i++) System.out.print(nonPrimes[i] + " ");
        
        System.out.print("\nFinal Array: ");
        for (int i = 0; i < pCount + npCount; i++) System.out.print(merged[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] myArr = new int[size];
        
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            myArr[i] = sc.nextInt();
        }
        
        PrimeArrayManager manager = new PrimeArrayManager(myArr);
        manager.sortPrimesAscending();
        manager.sortNonPrimesDescending();
        manager.mergeArrays();
        manager.display();
    }
}