package com.vinay.labcode.applet;

import java.applet.Applet;
import java.awt.*;

public class Circle extends Applet {


    @Override
    public void paint(Graphics g) {
        for (int i = 0; i <= 5; i++) {
            if(i%2 == 0)
                g.drawOval(120,i*60+10,50,50);
            else
                g.fillOval(120, i*60+10,50,50);
        }
    }
}

/*
    <html>
        <body>
            <applet code="Circle.class" width=400 height=400>
            </applet>
        </body>
    </html>
 Save circle.html /run method: >appletviewer circle.html*/
