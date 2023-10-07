public class Mthread extends Thread{
    public static int amount=0;
    public static void main(String[] args) {
       Mthread thread =new Mthread();
        thread.start();
        while(thread.isAlive()){
            System.out.println("Waiting....");
        }
        System.out.println("Main "+amount);
        amount++;
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
    }

