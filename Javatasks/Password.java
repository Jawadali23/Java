import java.util.Scanner;

public class Password{
}
class MyException extends Exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in =sc.nextInt();
      String ch = sc.next();
        if (in <8 && ch=="*") {

            try {
                System.out.println(in+""+ch);
            } catch (java.lang.Exception e) {
                throw new RuntimeException(e);
            }
        }

    }

}
