
package GUI;

import java.awt.LayoutManager;
import javax.swing.JPanel;


public class MyJPanel extends JPanel{

    public MyJPanel(String title , int height , int width, LayoutManager layout) {
        super(layout);
        super.setSize(width, height);
        super.setName(title);
    }
    
}
