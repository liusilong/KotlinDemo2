package sleep;

public class Demo1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("begin = "+System.currentTimeMillis());
        myThread1.start();
        System.out.println("end = "+System.currentTimeMillis());
    }


}
class MyThread1 extends Thread{
    @Override
    public void run() {

        try {
            System.out.println(this.currentThread().getName()+"begin...");
            Thread.sleep(2000);
            System.out.println(this.currentThread().getName()+"end...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
