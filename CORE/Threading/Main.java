// 4. Find Sum of Large Array Using Multiple Threads

// Description: 
// Split an array into multiple parts and calculate the total sum using multiple threads.

// Example
// 	Input: [10,20,30,40,50,60]

// Output: 210

// Concepts Tested

// Parallel processing
// Thread joining
// Shared results


class SumTask extends Thread {

    private int[] arr;
    private int start;
    private int end;

    private int sum = 0;


    public SumTask(int[] arr, int start, int end) {

        this.arr = arr;
        this.start = start;
        this.end = end;

    }


    public void run() {

        for(int i = start; i < end; i++) {
            sum += arr[i];
        }

        System.out.println(
            Thread.currentThread().getName() + 
            " Sum : " + sum
        );
    }


    public int getSum() {
        return sum;
    }
}


public class Main {

    public static void main(String[] args) throws InterruptedException {


        int[] arr = {10,20,30,40,50,60};


        SumTask t1 = new SumTask(arr, 0, 3);
        SumTask t2 = new SumTask(arr, 3, 6);


        t1.setName("Thread-1");
        t2.setName("Thread-2");


        t1.start();
        t2.start();


        // Wait for both threads to finish
        t1.join();
        t2.join();


        int total = t1.getSum() + t2.getSum();


        System.out.println("Total Sum : " + total);

    }
}
