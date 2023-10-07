import javax.swing.*;
import java.awt.*;
public class Gridl {
JFrame jFrame;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
Gridl(){
    jFrame =new JFrame();
    jFrame.setSize(400,400);
//    JTextField jTextField=new JTextField();
//    jTextField.setBounds(20,30,100,50);
    jFrame.setTitle("GridLayout");
    b1=new JButton("1");
    b2=new JButton("2");
    b3=new JButton("3");
    b4=new JButton("4");
    b5=new JButton("5");
    b6=new JButton("6");
    b7=new JButton("7");
    b8=new JButton("8");
    b9=new JButton("9");
    jFrame.setVisible(true);
    //jFrame.add(jTextField);
    jFrame.add(b1);
    jFrame.add(b2);
    jFrame.add(b3);jFrame.add(b4);
    jFrame.add(b5);jFrame.add(b6);
    jFrame.add(b7);jFrame.add(b8);
    jFrame.add(b9);
    jFrame.setLayout(new GridLayout(3,4));
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
    public static void main(String[] args) {
        new Gridl();
    }
}
