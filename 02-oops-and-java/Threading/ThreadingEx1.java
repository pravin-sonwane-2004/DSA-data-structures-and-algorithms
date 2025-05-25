
public class ThreadingEx1 {
    void main() throws InterruptedException {
        Thread t1 = new Thread( () -> {
          for(int i=0;i<100;i++) {
            IO.println(i);
        try {
            Thread.sleep(200);
        } catch (Exception e) {
          IO.print(e);
        }
          }
        });


         Thread t2 = new Thread( () -> {
          for(int i=0;i<100;i++) {
            IO.println(i);
        try {
            Thread.sleep(200);
        } catch (Exception e) {
          IO.print(e);
        }
          }
        });

        t1.start();
        t1.wait();
        t2.start();
      }
}









