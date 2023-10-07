import javax.swing.*;
//import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class OptionPane extends WindowAdapter {
    public JFrame jFrame;
    public OptionPane() {
        jFrame = new JFrame();
        jFrame.addWindowListener((WindowListener) this);
        jFrame.setSize(400, 400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }
        // JOptionPane.showConfirmDialog(jFrame,"Are You Sure?:");

        //JOptionPane.showMessageDialog(jFrame,"Hello boys","Info", JOptionPane.INFORMATION_MESSAGE);
//JOptionPane.showMessageDialog(jFrame,"Successfully Updated","   Alter  ",JOptionPane.WARNING_MESSAGE );
//  String st= JOptionPane.showInputDialog(jFrame,"Enter Name ");
//  jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    public void windowClosing(WindowEvent event){
     try {
         int a=JOptionPane.showConfirmDialog(jFrame,"Are You Sure?");

        if (a==JOptionPane.YES_OPTION){
            jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
     }catch (Exception e){
         e.printStackTrace();
     }
    }
    public static void main(String[] args) {
        new OptionPane();
    }

}
