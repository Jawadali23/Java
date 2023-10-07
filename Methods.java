public class Methods {
    /*int display(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;
      }*/
    static void foo(){
        System.out.println("Good After noon ");
    }
    static void foo(String a){
        System.out.println("Good After noon "+a);
    }
    static void foo(String a,int b){
        System.out.printf("Good After noon %s you give me %d",a,b);
    }

// void display (int a){
  //  a=45;
//}
void change(int[] arr){

   arr [0]=98;
}
  //  static void TallJokes(){
    //    System.out.println("I invented a new word \n"+"Plagiarism" );
    //}

    public static void main(String[] args) {
      //  TallJokes();
        Methods m=new Methods();
        foo();
        foo("Junaid ");
        foo("Sanaullah",95);
      /*   int [] arr={72,75,80,82,85};
        int x=86;
        m.display(x);
     System.out.println(x);
   */
        /*int [] marks={72,75,80,82,85};
        m.change(marks);
        System.out.println(marks[0]);
          int a,b,c;
    Methods m=new Methods();
   c= m.display(8,2);
    //c=display(3,5);
        System.out.println(c);
        // System.out.println(c);
    int a1,b1,c1;
    c1=m.display(2,4);
        System.out.println(c1);*/
   // c1=display(5,6);
     //   System.out.println(c1);

    }
}
