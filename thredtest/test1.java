package thredtest;

public class test1 {
    public static void main(String[] args) {
        thred1 thred1=new thred1();
        Thread thread=new Thread(thred1,"aa");
        Thread thread11=new Thread(thred1,"bb");
        Thread thread111=new Thread(thred1,"cc");
          thread.start();
          thread11.start();
        thread111.start();
    }

}
