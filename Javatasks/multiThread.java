public class multiThread extends Thread {
    public static void main(String[] args) {
        multiThread mt = new multiThread();
        mt.start();
    }

    public void run() {
        for (int i = 0; i < 30; i++) {

            if (i % 2 == 0) {
                try {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Inside the multiThread "+i);
            }
        }
    }
}