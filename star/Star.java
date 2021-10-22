package org.hillcrest.chapter3.star;

import java.awt.*;
import java.awt.geom.Line2D;

public class Star{

    private int x1;
    private int y1;

    public Star(int x,int y){
        x1 = x;
        y1 = y;

    }
    public void draw(Graphics2D g2){
        Line2D.Double Line1 = new Line2D.Double(x1, y1, x1+100,y1+100);
        Line2D.Double Line2 = new Line2D.Double(x1,y1+50, x1+100,y1+50);
        Line2D.Double Line3 = new Line2D.Double(x1,y1+100, x1+100,y1);
        Line2D.Double Line4 = new Line2D.Double(x1+50,y1, x1+50,y1+100);

        g2.draw(Line1);
        g2.draw(Line2);
        g2.draw(Line3);
        g2.draw(Line4);
    }

}
