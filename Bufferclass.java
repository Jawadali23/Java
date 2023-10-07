import java.io.*;
import java.util.Scanner;

public class Bufferclass {
    public static void main(String[] args)throws IOException {

     /*   BufferedWriter bf=new BufferedWriter(new FileWriter("Name.txt"));
        bf.write("Greater the loss of energy greater will be stability");
        bf.close();
*/
        BufferedReader br=new BufferedReader(new FileReader("Name.txt"));
        String line ;
        line=br.readLine();
        System.out.println(line);


    }

}
