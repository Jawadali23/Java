import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Arraylist {
public static void main(String []array){
    ArrayList<Integer>list=new ArrayList<Integer>();
    list.add(5);
    list.add(2);
    list.add(1);
    list.add(0);
    System.out.println(list);

    // get element through index
    int element = list.get(2);
    System.out.println(element);

    list.add(0,4);
    System.out.println(list);

    list.set(1,3);
    System.out.println(list);


    list.remove(4);
    System.out.println(list);

    int size=list.size();
    System.out.println(size);

    for (int i=0;i<size;i++){
        System.out.print(element+i);
    }
    System.out.println();

    Collections.sort(list);
    System.out.println(list);
}
}
