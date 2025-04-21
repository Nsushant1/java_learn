package Threading;

public class InterfaceMethod implements Runnable{
    @Override
    public void run() {
        try{
            for (int i=0;i<10;i++){
                Thread.sleep(1000);
                System.out.println("Processing email for user"+i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
