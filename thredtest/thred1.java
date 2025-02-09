package thredtest;

import java.io.IOException;
import java.nio.CharBuffer;

public class thred1 implements Runnable {
    public static boolean w=true;
    private static int count=100;
    public synchronized  void a() {
        if (count <= 0) {
            w = false;
        } else {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                count--;
                System.out.println(Thread.currentThread().getName() + "当前进程,还剩" + count);


        }
    }
    @Override
    public void run() {
      while (w){
          a();
      }

    }



}
