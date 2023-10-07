import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
int a,b,result;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number ");
        a=scan.nextInt();
        b=scan.nextInt();
        result=a+b;
        System.out.println("The sum of the two numbers is "+result);
        result =a-b;
        System.out.println("The Subtraction of Two Numbers is "+result);
        result=a*b;
        System.out.println("Multiplication of two Numbers is "+result);
        result =a/b;
        System.out.println("Division of Two Numbers is "+result);
    }
}
