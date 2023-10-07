import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewFile {
    public static void main(String[] args)  {

        /*try {
            File file =new File("New.txt");
            if (file.createNewFile())
            System.out.println("File create" + file.getName());
            else {
                System.out.println("File Already Created");
                //file.close();
            }
        }catch (IOException e){
            System.out.println(e);
        }
        finally {
            System.out.println("You have Done");
        }*/


       /* try {
            FileWriter fileWriter =new FileWriter("New.txt");
            fileWriter.write("Saturday will be the last Exam that is important \n 216");
             // fileWriter.write(151685);
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e);
        }*/
       /* try {
        FileReader fileReader=new FileReader("New.txt");
        Scanner myRead=new Scanner(fileReader);
          while (myRead.hasNextLine()) {
              String read = myRead.nextLine();
              System.out.println(read);
          }
        }catch (Exception e){
            System.out.println(e);
        }*/
        File file =new File("Final.txt");

        if (file.delete()){
            System.out.println("Delete the File:"+file.getName());
        }
        else {
            System.out.println("Failed to Delete the folder ");
        }
    }
}
