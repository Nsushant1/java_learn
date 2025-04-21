package Threading;

public class MyThread {
    public static void main(String[] args) {

        System.out.println("User Registration has been started");
        ClassThread thread1 = new ClassThread();
        thread1.start();


        Thread thread2 = new Thread(new InterfaceMethod());
        thread2.start();
    }
}
