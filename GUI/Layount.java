import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layount {
    public JFrame jFrame;
    public JPanel jPanel;
    Layount(){
        jFrame=new JFrame();
        jPanel= new JPanel();
        JTextField jTextField =new JTextField();
        jTextField.setBounds(10,10,300,40);
       // jPanel.add(jTextField);
       jFrame.add(jTextField);
        JButton jb=new JButton("+");
        JButton jb1=new JButton("*");JButton jb2=new JButton("-");
        JButton jb3=new JButton("/");JButton jb4=new JButton("1");
        JButton jb5=new JButton("2");JButton jb6=new JButton("3");
        JButton jb7=new JButton("4");JButton jb8=new JButton("5");
        JButton jb9=new JButton("6");JButton jb10=new JButton("7");
        JButton jb11=new JButton("8");JButton jb12=new JButton("9");
        JButton jb13=new JButton("0");JButton jb14=new JButton(".");
        JButton jb15=new JButton("=");
        JButton j=new JButton("Clear");
        //j.setBounds(300,300,90,40);
        jPanel.add(jb);jPanel.add(jb1);jPanel.add(jb2);jPanel.add(jb3);
        jPanel.add(jb4);jPanel.add(jb5);jPanel.add(jb6);jPanel.add(jb7);
        jPanel.add(jb8);jPanel.add(jb9);jPanel.add(jb10);jPanel.add(jb11);
        jPanel.add(jb12);jPanel.add(jb13);jPanel.add(jb14);jPanel.add(jb15);
        jPanel.add(j);
//        jFrame.add(jb); jFrame.add(jb1); jFrame.add(jb2); jFrame.add(jb3);
//        jFrame.add(jb4); jFrame.add(jb5); jFrame.add(jb6); jFrame.add(jb7);
//        jFrame.add(jb8); jFrame.add(jb9); jFrame.add(jb10); jFrame.add(jb11);
//        jFrame.add(jb12); jFrame.add(jb13); jFrame.add(jb14); jFrame.add(jb15);
//        jFrame.add(j);
//        j.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//        }
//        });

        jFrame.setSize(400,400);
        jPanel.setSize(100,100);
        jPanel.setLayout(new GridLayout(5,4,10,10));
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Layount();
    }
}
