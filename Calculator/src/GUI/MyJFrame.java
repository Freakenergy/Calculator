
package GUI;

import java.awt.ComponentOrientation;
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class MyJFrame extends JFrame{
    
    public MyJFrame(String title, int height , int width) {
        super(title);
        super.setSize(width, height);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setVisible(true);
    }
    
    
    
}
