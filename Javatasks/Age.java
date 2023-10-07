import java.util.Scanner;
public class Age {
    void eligible() {
        System.out.println("You are Eligible");
    }

    void NotEligible() {
        System.out.println("You are not Eligible");
    }
}

       class myexception extends Exception {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int in = sc.nextInt();
            Age a=new Age();
            if ( in ==18 || in>18 ) {
                try {
                    a.eligible();

                } catch (java.lang.Exception e) {
                    throw new RuntimeException(e);
                }

            }
            else{
                a.NotEligible();
            }
        }
    }
