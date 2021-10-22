package org.hillcrest.chapter3.star;

import org.hillcrest.chapter3.star.Star;

import javax.swing.*;
import java.awt.*;


public class StarComponent extends JComponent {

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Star Star1 = new Star(234,432);
        int x1 = getWidth()  - 217;
        int y1 = getHeight() - 369;

        Star Star2 = new Star(x1,y1);
        x1 = getWidth()- 420;
        y1 = getHeight() - 609;

        Star Star3 = new Star(x1, y1);

        x1 = getWidth()- 350;
        y1 = getHeight()-350;

        Star Star4 = new Star(x1, y1);

        x1 = getWidth()-600;
        y1 = getHeight()-450;

        Star Star5 = new Star(x1,y1);

        Star1.draw(g2);
        Star2.draw(g2);
        Star3.draw(g2);
        Star4.draw(g2);
        Star5.draw(g2);
    }

}
