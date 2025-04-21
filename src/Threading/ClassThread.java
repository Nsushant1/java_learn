package Threading;

public class ClassThread extends Thread{
    @Override
    public void run() {
        try{
            for (int i=0;i<10;i++){
                Thread.sleep(1000);
                System.out.println("Role Creation for user"+i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
