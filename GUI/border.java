import javax.swing.*;
import java.awt.*;

public class border {
   // private static final int NORTH = ;
    JFrame jFrame;
    JButton b1,b2,b3,b4,b5;
    public border() {
        jFrame = new JFrame();
        jFrame.setSize(400, 400);
        jFrame.setTitle("BorderLayout");
        b1 = new JButton("North");
        b2 = new JButton("South");
        b3 = new JButton("East");
        b4 = new JButton("West");
        b5 = new JButton("Center");
       // jFrame.setLayout(new BorderLayout(20,45));
//        jFrame.add(b1, BorderLayout.NORTH);
//        jFrame.add(b2, BorderLayout.SOUTH);
//        jFrame.add(b3, BorderLayout.EAST);
//        jFrame.add(b4, BorderLayout.WEST);
//        jFrame.add(b5, BorderLayout.CENTER);
        jFrame.add(b1);
        jFrame.add(b2);
        jFrame.add(b3);
        jFrame.add(b4);
        jFrame.add(b5);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
      border b=new border();
    }
}
