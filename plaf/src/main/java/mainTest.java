import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/08/24.
 */
public class mainTest {
    public static void main(String[] args){
        //System.out.println("Hello, World!");
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlafFrame pf = new PlafFrame();

                //basic setting for frame.
                pf.setTitle("PlafFrameTest");
                pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                pf.setVisible(true);
            }
        });
    }
}