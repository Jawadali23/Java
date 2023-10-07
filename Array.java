public class Array {
    public static void main(String[] args) {
    /*    int [] arr=new int[5];
    int [] arr={155,48,6,44} ;
       // int [] arr;
        arr=new int[5];
        arr[0]=12;
        arr[1]=52;
        arr[2]=32;
        arr[3]=54;
        arr[4]=40;
        System.out.println(arr[4]);

  */
//char [] ch={'a','b','c','d','e','f'};
        /*char []  ch=new char[6];
        ch[0]='A';
        ch[1]='B';
        ch[2]='C';
        ch[3]='D';
        ch[4]='E';
        ch[5]='F';
        */
        //      System.out.println(ch[4]);



      /*  float []  Arr={45.5f,56.21f,42.21f,2.125f};
        System.out.println(Arr.length);
        //System.out.println(Arr[1]);
        System.out.println(Arr[1]);
        System.out.println(Arr[3]);
    */
 /*   String []  Name={"Mahtab","Azlan","Zakir"};
        System.out.println(Name.length);
        System.out.println(Name[0]);
*/
  //      int []  arr={12,45,21,65,24,32};
 /*       System.out.println(arr.length);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/


/*
        int []  arr={12,45,21,654,24,32};
        System.out.println("Reverse order");
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

    */
     //for-Each loop
/*for(int i:arr ){
    System.out.println(i);
}
*/
   int [][] Arr;
  Arr= new int[2][3];
      Arr[0][0]=01;
      Arr[0][1]=02;
      Arr[0][2]=03;
      Arr[1][0]=04;
      Arr[1][1]=05;
      Arr[1][2]=06;
      //  System.out.println(Arr[1][2]);

    for (int i=0;i<Arr.length;i++){
        for (int j=0;j<Arr[i].length;j++){
            System.out.print(Arr[i][j]);
            System.out.print(" ");
        }
        System.out.println("");
        }
    }

}
