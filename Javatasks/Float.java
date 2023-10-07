import java.util.Scanner;
public class Float {
    public static void main(String[] args)

    {
       float n= 0,s=0;

        double avg;
        {

            System.out.println("Input the 5 numbers : ");

        }
        for (int i=0;i<5;i++)
        {
            Scanner in = new Scanner(System.in);
             n = in.nextFloat();

            s +=n;
        }
        avg=s/5;
        System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);

    }
}

