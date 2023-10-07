public class Class {

    public class Counter extends Thread{

          private Printer p1;
           public void main(String[] args){
            Storage store = new Storage();
            Counter c1 = new Counter(store);
        }
        Storage st;
        public Counter(Storage store){
            st = store;

            p1 = new Printer(store);
            new Thread(this, "Counter").start();

        }
        @Override
        public void run() {
            int i = 0;
            while(true){
                if(st.getValue() == null){
                    st.setValue(i);

                    synchronized(p1){
                        p1.notify();
                    }
                    i++;
                }
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){

                }
            }

        }

    }
    class Printer extends Thread{
        Storage st;
        public Printer(Storage st){
            this.st = st;
            new Thread(this, "Printer").start();
        }
        @Override
        public void run() {
            while(true){
                while(st.getValue() != null)
                    synchronized(this){
                        try{
                            wait();
                        }catch(InterruptedException e){

                        }
                    }
                System.out.println(Thread.currentThread().getName() + " " + st.getValue());
                st.i = 0;
            }
        }

    }
    class Storage{
        int i;
        public Storage(){
            if(i != null && i  == 10){
                System.exit(0);
            }
        }
        public void setValue(int i){
            this.i = i;
        }
        public int getValue(){
            return this.i;
        }
    }
}
