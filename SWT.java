import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SWT extends JFrame implements ActionListener {
    public JTextField jTextField;
    public JLabel jLabel,jLabel1,jLabel2;
    public JTextArea jTextArea;
    public JButton jButton,jButton1,jButton2;
    public JPanel jPanel;
    public CheckBox checkBox;
    public SWT(){
        jLabel=new JLabel();
        jPanel =new JPanel();
        jTextField=new JTextField();
        jButton= new JButton();
        jTextArea=new JTextArea();
        jTextArea.setBackground(Color.cyan);
        jTextArea.setBounds(20,80,150,80);
        jTextArea.setForeground(Color.red);
        add(jTextArea);
        add(jPanel);
        jButton1 =new JButton("Words Count");
        jButton1.setBounds(100,180,190,40);
        jLabel1=new JLabel();
        checkBox =new CheckBox("Tea @ 40");
        jLabel1.setBounds(20,30,190,40);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text= jTextArea.getText();
                String []word= text.split(" ");
                jLabel1.setText("Total char "+text.length());
            }
        });
        add(jLabel1);
        add(jButton1);
        jLabel2=new JLabel("Password");
        jLabel2.setBounds(150,230,90,80);
        JPasswordField jPasswordField=new JPasswordField();
        jPasswordField.setBounds(230,260,80,20);
        add(jPasswordField);
        add(jLabel2);
        jButton2=new JButton("Check");
        jButton2.setBounds(230,290,80,20);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPasswordField.setText("Jawad");
            }
        });
        add(jButton2);
        jButton.addActionListener(this);
        jButton.setText("Click");
        jButton.setBounds(180,120,100,40);
       add(jButton);
       setLayout(null);
       setTitle("OOP");
       setSize(500,500);
       setVisible(true);
       jLabel.setText("Enter Your Name");
       jLabel.setBounds(10,10,100,30);
       jTextField.setBounds(115,20,90,18);
       jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Enter Surname");
                jTextField.setBounds(115,20,90,18);
            }
        });
        add(jLabel);
        add(jTextField);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );

       }
       @Override
       public void actionPerformed(ActionEvent e){
       jLabel.setText("Enter ID");
       jTextField.setBounds(100,20,90,18);
       }
    public static void main(String[] args) {
    SWT swt=new SWT();
    }
}