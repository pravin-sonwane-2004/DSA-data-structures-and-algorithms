public class EO {
    void main() {
        EvenNo e = new EvenNo();
        OddNo o = new OddNo();

       for(int i=0;i<100;i++ ){
            e.start();
            o.start();
       }
    }
} 

class EvenNo extends Thread {
    public static int counter = 0;

    @Override
    public void run() {
             for(int i = 0; i < 100; i++) {

            IO.println("Even = " + counter);

            counter += 2;
        }
    }
}

class OddNo extends Thread {
    public static int counter = 1;

    @Override
    public void run() {
             for(int i = 0; i < 100; i++) {

            IO.println("Odd = " + counter);

            counter += 2;
        }
    }
}