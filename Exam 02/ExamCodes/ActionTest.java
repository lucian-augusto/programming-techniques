import java.awt.*;
import java.awt.event.*;

public class ActionTest extends Frame {
    public ActionTest() {
        Button test = new Button("Test");
        add(test);
        test.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked");
                Button b = (Button) e.getSource();
                b.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Clicked again");
                    }
                });
            }
        });
        setSize(100, 100);
        setVisible(true);
        setTitle("My Frame");
    }

    public static void main(String args[]) {
        new ActionTest();
    }
}
