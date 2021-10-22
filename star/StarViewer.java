package org.hillcrest.chapter3.star;

import org.hillcrest.chapter3.star.StarComponent;

import javax.swing.*;

public class StarViewer {
    public static void main (String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(700, 700);
        frame.setTitle("org.hillcrest.chapter3.star.StarViewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StarComponent Star1 = new StarComponent();
        frame.add(Star1);
        frame.setVisible(true);
    }




}
