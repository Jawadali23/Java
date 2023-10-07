public class Loops {
    public static void main(String[] args) {
        //int a = 11;
        /*while (a<=3){
            System.out.println(a);
            a++;
        }
        do{
            System.out.println(a);
            a++;
        }
        while (a<15 );
    }
*/
        //int n=5;
        //for (int i=0;i<=n;i++){
         //   System.out.println(2*i+1);
       // }
        //for (int i=10;i>=0;i--){
          //  System.out.println(i);
        //}
     /*  int n=20;
    for (int i=n;i>=1;i--){
        System.out.println(i);
    }*/

  //      int a=0;
        /*for (int i=0;i<a;i++){
            System.out.println(i);
            if(i==2){
               System.out.println("End of the Loop ");
            break;
            }
        }*/
        //while (a<=10){
            //System.out.println(a);
            //a++;
           // if (a==2){
             //   System.out.println("Finished ");
               // break;
         //   }
            //a++;
       // }
/*
        do {
            System.out.println(a);

            if (a==2){
                System.out.println("Exist ");
                break;
            }
            a++;
        }while (a<=5);
        System.out.println("Outside the Loop ");*/

        /*for (int i=0;i<10;i++){

            if (i==2){
                System.out.println("Escape the statements ");
            continue;
            }
            System.out.println(2*i);
            System.out.println("Work Hard ");

        }*/
int i=0;
do {
    i++;
    System.out.println("Do While Loop ");
    if (i==3){
        System.out.println(2*i+1);
        continue;
    }
    System.out.println("Chick it ");
}while (i<=10);
    }
}
