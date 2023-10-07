public class Main {
    static int divide(int a,int b) throws ArithmeticException{
        int result =a/b;
        return result;
    }
    public static void main(String[] args) {
try {
    int c= divide(85,0);
    System.out.println(c);
}catch (ArithmeticException e){
    System.out.println(e);
}
finally {
    System.out.println("NONE Of These");
}

        //        int a=10;
//        int b=0;
//        try {
//            int c= a/b;
//            System.out.println("The Result is :"+c);
//        }catch (Exception e){
//            System.out.println("The Division does not Exist");
//            System.out.println(e);
//        }
//        finally{
//            System.out.println("The Program Has been Ended");
//        }
    }
}
