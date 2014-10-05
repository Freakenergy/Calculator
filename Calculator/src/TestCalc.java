
import GUI.MyJFrame;


public class TestCalc {

    public static MyJFrame frame;
    
    public static void main(String[] args) {
        
        TestCalc testCalk = new TestCalc();
        
        testCalk.createFrame();
    }
    
    
    private void createFrame(){
    
         frame = new  MyJFrame("Calculator", 240, 320);
         
    }
    
}
