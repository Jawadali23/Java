import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing implements ActionListener {
    public JFrame jFrame;
    public JTextField jTextField;
    public JLabel jLabel;
   public JPasswordField jPasswordField;
   public JTextArea jTextArea;
    public Swing(){
        jFrame =new JFrame("Swing");
        JButton jButton =new JButton("Click");
        jButton.setBounds(150,100,80,30);
        JButton jButton2=new JButton(" Password ");
        jButton2.setBounds(190,150,80,30);
        jFrame.add(jButton);
        jFrame.add(jButton2);
        jTextArea =new JTextArea();
        jTextArea.setBounds(160,182,96,182);
        jTextArea.setBackground(Color.cyan);
        jTextArea.setForeground(Color.black);
        jFrame.add(jTextArea);
        jTextField=new JTextField();
        jTextField.setBounds(100,60,90,30);
        jLabel=new JLabel("Enter the Name");
        jLabel.setBounds(10,60,120,30);
        jFrame.setSize(400,400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jPasswordField =new JPasswordField();
        jPasswordField.setBounds(100,60,90,30);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           jPasswordField.setText("Swing");
            }
        });
     /*   jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String st;

                jPasswordField.getText();
            }
        });*/
        jButton.addActionListener( this);
        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jFrame.add(jPasswordField);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        jLabel.setText("Enter ID");
        jLabel.setBounds(10,60,120,30);

        jPasswordField.getPassword();
    }
public static void main(String []args){
        new Swing();
}
}
