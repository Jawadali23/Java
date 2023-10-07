import javax.swing.*;
import java.awt.*;

import static java.awt.AWTEventMulticaster.add;

public class BoxLayout{

    public JFrame jFrame;
    public JButton[] buttons;
    public BoxLayout(){
        jFrame =new JFrame("BoxLayout");
       buttons=new JButton[5];
        for (int i = 0;i<5;i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            // adding the buttons so that it can be displayed
            add (buttons[i]);
        }
        //JButton jb=new JButton("1");
//        JButton jb1=new JButton("2");
//        JButton jb2=new JButton("3");
//        JButton jb3=new JButton("4");
        jFrame.setLayout(new javax.swing.BoxLayout(jFrame, javax.swing.BoxLayout.Y_AXIS));
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
    }

    private void add(JButton button) {
    }
    public static void main(String[] args) {
        new BoxLayout();
    }
}
