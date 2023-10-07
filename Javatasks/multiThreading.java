class myThread1 extends Thread{
@Override
public void run(){
    int i=0;
while(i<200){
    System.out.println("My thread1 is Running");
    System.out.println("I am Happy");
    i++;
}
}
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<200){
            System.out.println("My thread2 is Running");
            System.out.println("Feeling Well");
        i++;
        }
    }
}
public class multiThreading {
    public static void main(String[] args) {
    myThread1 mt1=new myThread1();
    myThread2 mt2=new myThread2();
    mt1.start();
    mt2.start();
    }
}
