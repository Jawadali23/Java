import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
  /*      File file= new File("Final.txt");
        try
        {
            file.createNewFile();
        }catch(IOException e){
            System.out.println(e);
        }
*/
//        try {
//            FileWriter fileWriter = new FileWriter("Final.txt");
//            fileWriter.write("Enjoying During the Exams ");
//            fileWriter.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        File file= new File("Final.txt");
        try {
            Scanner sc = new Scanner(file);
           while (sc.hasNextLine()){
               String line= sc.nextLine();
               System.out.println(line);
           }
           sc.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }}






