import java.io.File;
import java.io.IOException;


public class file {
    public static void main(String[] args) {
      File mf=new File("myfile.txt");
        try {
            mf.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
