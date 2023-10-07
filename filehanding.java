import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehanding {


    public static void main(String[] args) {
     File myFile =new File("FirstFile.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }/*
        try {
            FileWriter fileWriter = new FileWriter("FirstFile.txt");
            fileWriter.write("This is my First File");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File myFile =new File("FirstFile.txt");
        try {
            Scanner sc=new Scanner(myFile);
           String line=sc.nextLine();
            System.out.println(line);
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }*/
}
