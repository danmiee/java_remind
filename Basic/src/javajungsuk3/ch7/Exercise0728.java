package javajungsuk3.ch7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// [7-28] 아래의 EventHandler를 익명 클래스(anonymous class)로 변경하시오.
public class Exercise0728 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}

//class EventHandler extends WindowAdapter {
//    public void windowClosing(WindowEvent e) {
//        e.getWindow().setVisible(false);
//        e.getWindow().dispose();
//        System.exit(0);
//    }
//}