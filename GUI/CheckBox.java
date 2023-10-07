import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox extends JFrame {
    JLabel jLabel;
    JTextField jTextField;
    JButton jButton;
    JFrame jFrame;
    JRadioButton jRadioButton1,jRadioButton2;
    JCheckBox jCheckBox1,jCheckBox2,jCheckBox3;
    public CheckBox(String s) {
        setTitle("Hotel Menu");
        setVisible(true);
        setSize(400, 400);
        setLayout(null);
        String []cityName={"Larkana","Naudero","Mahota","Sukkur"};
        JComboBox jComboBox=new JComboBox(cityName);
        jComboBox.setBounds(100,100,80,30);
        jButton=new JButton("Click");
        jButton.setBounds(120,150,90,30);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(jFrame,"Are YOu Sure?");

            }
        });
        add(jComboBox);
        add(jButton);
//        jRadioButton1 = new JRadioButton("Male ");
//        jRadioButton1.setBounds(100, 120, 80, 30);
//        jRadioButton2 = new JRadioButton("Female ");
//        jRadioButton2.setBounds(120, 140, 70, 40);
//        add(jRadioButton1);
//        add(jRadioButton2);
//        jButton = new JButton("Select");
//        jButton.setBounds(120, 160, 70, 30);
//        add(jButton);
//        jButton.addActionListener(this);
//        {

            //        jLabel=new JLabel("Menu");
//        jLabel.setBounds(10,10,40,20);
//        jCheckBox1 =new JCheckBox("Karhai 1500");
//        jCheckBox1.setBounds(30,50,100,40);
//        jCheckBox2=new JCheckBox("Barhni 200");
//        jCheckBox2.setBounds(30,80,90,40);
//        jCheckBox3=new JCheckBox("Tea 40");
//        jCheckBox3.setBounds(30,110,90,40);
//        jButton =new JButton("TOTAL");
//        jButton.setBounds(50,150,100,40);
//        jButton.addActionListener(this);
//        j
//        add(jButton);
//        add(jLabel);
//        add(jCheckBox1);
//        add(jCheckBox2);
//        add(jCheckBox3);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
//public void actionPerformed(ActionEvent e){
//        JOptionPane.showConfirmDialog(this,"Are You Sure?");
//}



//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (jRadioButton1.isSelected()){
//            JOptionPane.showMessageDialog(jFrame,"You are Male");
//            //final var Selected: boolean =  jRadioButton2.isSelected(false);
//
//
//
//        } else if (jRadioButton2.isSelected()) {
//            JOptionPane.showMessageDialog(jFrame,"You are Female ");
//        }
//    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        int amount = 0;
//        if (jCheckBox1.isSelected()) {
//            amount += 1500;
//        }
//        if (jCheckBox2.isSelected()){
//            amount += 200;
//    }  if (jCheckBox3.isSelected()){
//                amount += 40;
//        }
//
//        JOptionPane.showMessageDialog(jFrame,"Total "+amount);
//    }
    public static void main(String[] args) {
        CheckBox ch=new CheckBox("Tea @ 40");
    }


    public boolean isSelected() {
        return false;
    }
}
