public class Vararr {
//static int display2(int a,int b,int c,int d){
  //  return a+b+c+d;

//public static int display( int...arr){




    ///Recursion
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else {
            int product=1;
            for (int i=1;i<=n;i++){
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        //System.out.println(display(20));
         //System.out.println(display2(25,18,20,79));
         //System.out.println("Sum of these values "+display(88,99,85,63,72));
        System.out.println(factorial(1));





        /*  int result=0;
    for (int a:arr) {
        result += a;
    }
    return result;
    }
*/
}
}





