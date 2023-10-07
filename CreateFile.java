import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        FileWriter fl=new FileWriter("Students.txt");
        fl.write("Name Junaid Ali \nRollNumber 21SW038");

        fl.close();
    }
}
