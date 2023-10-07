import javax.swing.*;
import java.awt.*;

public class Registration {
    public JFrame jFrame;
    public JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7;
    public JTextField jt1,jt2,jt3,jt4;
   public JComboBox jc;
   public Registration(){
        jFrame = new JFrame("Registration Form");
        jFrame.setSize(800, 800);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jl1 = new JLabel("Name ");
        jl1.setBounds(20, 20, 90, 30);
        jt1 = new JTextField();
        jt1.setBounds(90, 90, 120, 30);
        jl2 = new JLabel("Gender ");
        jl2.setBounds(20, 90, 90, 30);
        String []st  = {"Male", "Female"};
      //  JComboBox jC = new JComboBox(st);
       jc=new JComboBox<String>(st);
       jc.setBounds(90, 100, 150, 40);
        jl3 = new JLabel("Father Name");
        jl3.setBounds(20, 100, 180, 30);
        jt2 = new JTextField();
        jt2.setBounds(90, 150, 150, 40);
        jl4 = new JLabel("Password");
        jl4.setBounds(20, 190, 90, 30);
        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(90, 180, 150, 40);
        jl5 = new JLabel("Confirm Password");
        jl5.setBounds(20, 210, 180, 40);
        JPasswordField jPasswordField1 = new JPasswordField();
        jPasswordField1.setBounds(90, 250, 190, 40);
        jl6 = new JLabel("City");
        jl6.setBounds(20, 280, 80, 30);
        jt3 = new JTextField();
        jt3.setBounds(90, 300, 100, 40);
        jl7 = new JLabel("Email");
        jl7.setBounds(20, 340, 90, 40);
        JButton jb = new JButton("Register");
        jb.setBounds(250, 360, 100, 40);
        JButton jb1 = new JButton("RESET");
        jb1.setBounds(290, 390, 100, 40);
        jFrame.setBackground(Color.magenta);
        jFrame.add(jb1);
        jFrame.add(jt1);
        jFrame.add(jl2);
        jFrame.add(jc);
        jFrame.add(jl3);
        jFrame.add(jt2);
        jFrame.add(jl4);
        jFrame.add(jPasswordField);
        jFrame.add(jl5);
        jFrame.add(jPasswordField1);
        jFrame.add(jl6);
        jFrame.add(jt3);
        jFrame.add(jl7);
        jFrame.add(jt4);
        jFrame.add(jb);
        jFrame.add(jb1);



   }

    public static void main(String[] args) {
        new Registration();
    }
}
