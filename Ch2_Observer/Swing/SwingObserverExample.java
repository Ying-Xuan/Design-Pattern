package Ch2_Observer.Swing;

import java.awt.event.*;
import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        // button.addActionListener(new AngelListener());
        // button.addActionListener(new DevilListener());

        button.addActionListener(event -> System.out.println("Don't do it, you might regret it!") );
        button.addActionListener(event -> System.out.println("Come on, do it!") );
        
        frame.getContentPane().add(button);
    
        // 設定 frame 屬性
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // 設定視窗大小
        frame.setVisible(true); // 顯示視窗
    }

    class AngelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("Don't do it, you might regret it!");
        }
    }
    class DevilListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
        System.out.println("Come on, do it!");
        }
    }
}