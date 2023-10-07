import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password {
   public JFrame jFrame;
   public JPasswordField jPasswordField;
   public JLabel jLabel,jLabel2,jL;

   public Password(){
       jFrame =new JFrame("Login Page");
       jPasswordField =new JPasswordField();
       jLabel =new JLabel("Username");
       jL =new JLabel();
       jL.setBounds(180,200,190,30);
       jLabel.setBounds(10,20,90,30);
       jLabel2=new JLabel("Password");
       jLabel2.setBounds(80,90,90,30);
       jPasswordField.setBounds(120,130,90,30);
       JTextField jTextField =new JTextField();
       jTextField.setBounds(60,40,90,30);
       JButton jButton=new JButton("LOGIN");
       jButton.setBounds(200,150,80,30);
        jFrame.setSize(400,400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.add(jButton);
        jFrame.add(jPasswordField);
        jFrame.add(jLabel);
        jFrame.add(jLabel2);
        jFrame.add(jTextField);
        jFrame.add(jL);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       jButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String data = " Username " +jTextField.getText();
                data += " Password: "+new String(jPasswordField.getPassword());
             //  String st= "Password " +jPasswordField.getPassword();
               jL.setText(data);
               //jL.setText(st);
           }
       });
   }

   public static void main(String[] args){
new Password();
    }
}
