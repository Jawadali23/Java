class One{
    public void method(){
        System.out.println("Good Morning");
    }
    public void method2(){
        System.out.println("My name is Java");
    }

}
class Second extends One{

public void method3(){
    System.out.println("Welcome to Java");
}
    public void method2(){
        System.out.println("My name is Java in class second");
    }
}

public class Dynamic {
    public static void main(String[] args) {
//One a=new One();
//a.method();
One a=new Second();
a.method();
    }
}
