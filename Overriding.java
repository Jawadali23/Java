class A{
    public int a;
    public int method(){
        return 4;
    }
    public void method2 (){
        System.out.println("I am method 2 of A");
    }
}
class B extends A{
    public void  meth3(){
        System.out.println("I am method 3 of B");
    }
    public void method2(){
        System.out.println("I am method 2 of B");
    }
}



public class Overriding {
    public static void main(String[] args) {
A a=new A();
//a.method2();

B b= new B();
b.method2();




    }
}
