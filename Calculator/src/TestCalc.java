
import GUI.MyJButton;
import GUI.MyJFrame;
import GUI.MyJPanel;
import GUI.MyJTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;


public class TestCalc {

    public static MyJFrame frame;
    
    public static MyJPanel panelDigit;
    public static MyJPanel panelButton;
    
    public static MyJTextField digitField;
    
    public static MyJButton buttonOne;
    public static MyJButton buttonTwo;
    public static MyJButton buttonThree;
    public static MyJButton buttonFour;
    public static MyJButton buttonFive;
    public static MyJButton buttonSix;
    public static MyJButton buttonSeven;
    public static MyJButton buttonEight;
    public static MyJButton buttonNine;
    public static MyJButton buttonZero;
    public static MyJButton buttonPercent;
    public static MyJButton buttonPoint;
    
    public static void main(String[] args) {
        
        TestCalc testCalk = new TestCalc();
        
        testCalk.createButton();
        testCalk.createTextField();
        testCalk.createPanel();
        testCalk.createFrame();
        
        
        
    }
    
    
    private void createFrame(){    
         frame = new  MyJFrame("Calculator", 280, 260);   
         frame.setLayout(new BorderLayout(1, 1));
         frame.add(panelDigit ,BorderLayout.NORTH  );
         frame.add(panelButton , BorderLayout.LINE_START);
    }
    
    private void createPanel(){
        panelDigit = new MyJPanel("digit", 50, 320, new FlowLayout());
        panelDigit.add(digitField);
        
        panelButton = new MyJPanel("", 60, 100, new GridLayout(4, 3, 5, 5));
        panelButton.setBorder(BorderFactory.createLineBorder(Color.green));
        panelButton.setPreferredSize(new Dimension(150, 100));
        
        panelButton.add(buttonOne);
        panelButton.add(buttonTwo);
        panelButton.add(buttonThree);
        panelButton.add(buttonFour);
        panelButton.add(buttonFive);
        panelButton.add(buttonSix);
        panelButton.add(buttonSeven);
        panelButton.add(buttonEight);
        panelButton.add(buttonNine);
        panelButton.add(buttonZero);
        panelButton.add(buttonPoint);
        panelButton.add(buttonPercent);
    }
    
    private void createTextField(){
       digitField = new MyJTextField("0", 22);
       digitField.setPreferredSize(new Dimension(220, 40));
       digitField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }
    
    private void createButton(){
        buttonOne = new MyJButton("1");
        buttonTwo = new MyJButton("2");
        buttonThree = new MyJButton("3");
        buttonFour = new MyJButton("4");
        buttonFive = new MyJButton("5");
        buttonSix = new MyJButton("6");
        buttonSeven = new MyJButton("7");
        buttonEight = new MyJButton("8");
        buttonNine = new MyJButton("9");
        buttonZero = new MyJButton("0");
        buttonPoint = new MyJButton(".");
        buttonPercent = new MyJButton("%");
        
        
    }
}
