import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       /*String [] array=new String[3];
       array[0]="Ja";
       array[1]="wa";
       array[2]="da";
       Scanner sc=new Scanner(System.in);
       String arr= sc.next();
       for (int i=0;i< array.length;i++) {
           if (arr == array[i]) {
               System.out.print(arr.indexOf(i));
           }else {
               System.out.println("Does not exit");

       }*/
ArrayList<String>list=new ArrayList<String>();
list.add("jawad");
list.add("ali");
        System.out.println(list);
      //  list .get(1);
       // System.out.println(list.get(1));
        //System.out.println(list.set(0,"Javed"));
        System.out.println(list.set(0,"Javed"));
        System.out.println(list.remove(0));
        String l1= list.remove(0);
        System.out.println(l1);
}

           }



