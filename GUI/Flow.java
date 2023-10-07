import javax.swing.*;
import java.awt.*;

public class Flow {
    JFrame frame;
    JButton b1,b2,b3,b4;
    Flow(){
     frame =new JFrame();
     frame.setSize(400,400);
     frame.setTitle("FLOW");
     b1=new JButton("1");
     b2=new JButton("2");
     b3=new JButton("3");
     b4=new JButton("4");

     frame.add(b1);
     frame.add(b2);
     frame.add(b3);
     frame.add(b4);

     frame.setLayout(new FlowLayout(FlowLayout.LEFT,18,20));
     frame.setVisible(true);
     frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {

        Flow f=new Flow();
    }
}
