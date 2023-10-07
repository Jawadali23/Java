import java.util.*;
    public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("H");
  // System.out.println(sb);
        //char at index
     /*   System.out.println(sb.charAt(2));
        System.out.println(sb.substring(3,5));
       System.out.println(sb.indexOf("d",4));
*/
        //System.out.println(sb.lastIndexOf("i",4));
        //System.out.println(sb.trimToSize("    Jawad "));
       // sb.setCharAt(2,'w');
        System.out.println(sb);
     //
        //   sb.insert(2,'n');
     //   System.out.println(sb);
        sb.delete(1,4);
        System.out.println(sb);
        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');
        System.out.println(sb.length());
        System.out.println(sb);
      /*  sb.delete(1,3);
        System.out.println(sb);
        sb.insert(3,'o');
        System.out.println(sb);*/
        for (int i=0;i<sb.length()/2;i++){
            int front =i;///0 1 2
            int back =sb.length()-1-i;
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }

    }

