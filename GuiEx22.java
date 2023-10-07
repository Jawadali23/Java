import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class guiEx1 {
    JFrame fr;

    guiEx1() {
        fr = new JFrame();
        fr.setTitle(" OOP ");
        JButton btn1 = new JButton();
        btn1.setText("Click Me ");
        fr.getContentPane().add(btn1);
        fr.setLayout(new FlowLayout());
        fr.setSize(400, 400);
        fr.setVisible(true);
    }

    public class GuiEx22 extends JFrame {
        JFrame fr;

        GuiEx22() {
            //fr=new JFrame();
            setTitle(" OOP ");
            JButton btn1 = new JButton();
            btn1.setText("Click Me ");
            /*btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //Todo  n
                    //  System.out.println();
                }
            });
*/

            getContentPane().add(btn1);


            setLayout(new FlowLayout());
            setSize(400, 400);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }

        public void main(String[] args) {
            new GuiEx22();
          //  new guiEx1();
        }
    }
}


