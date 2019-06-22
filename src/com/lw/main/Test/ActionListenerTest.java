package com.lw.main.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ActionListenerTest {
    public static void main(String[] args){

        JFrame jFrame = new JFrame("ActionListener Lambda Test");
        Container contentPane = jFrame.getContentPane();

        JButton jButton = new JButton("press me");
        jButton.setHorizontalTextPosition(JButton.CENTER);
        jButton.setVerticalTextPosition(JButton.CENTER);
        jButton.addActionListener((e)->{
            System.out.println("Hello Lambda~");

        });

        contentPane.add(jButton);
        jFrame.pack();
        jFrame.show();

        jFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });



    }

}
