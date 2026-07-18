public class PrintThreeThreads {

    void main() {

        ThisClass t1 = new ThisClass(1);
        ThisClass t2 = new ThisClass(2);
        ThisClass t3 = new ThisClass(3);


        t1.start();
        t2.start();
        t3.start();
    }
}


class ThisClass extends Thread {

    int n;

    ThisClass(int n) {
        this.n = n;
    }


    public void run() {

        for(int i = n; i < 10; i++) {
            IO.print(i + "  ");
        }
    }
}