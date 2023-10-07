 class A{
    int a;
String b;
    public A(int a,String b) {
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println(a+" "+ b);
    }
}
 class B extends A{
    int b=60;
    String z="Two";


     public B(int a, String b) {
         super(a, b);

     }

     void display2( ){
         super.display();
         System.out.println(b+" "+z);
     }
 }
class C extends B{

    int c=40;
    String y="Three";

    public C(int a, String b) {
        super(a, b);
    }

        void display3() {
        super.display2();
        System.out.println(c+" "+y);
    }
}

public class inheritance {

    public static void main(String[] args) {
        C x=new C(10,"Section");
       x.display3();
    }}
