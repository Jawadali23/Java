class myThread extends Thread {
    public class MyThread {
        public static void main() {
            myThread mt1 = new myThread();
            //  MyThread mt2=new Thread (new MyThread())
            mt1.start();
            //        System.out.println("Exiting Main Thread");
        }
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Inside class My thread i=" + i);
            if (i % 2 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}


