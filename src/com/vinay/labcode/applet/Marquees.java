package com.vinay.labcode.applet;

import java.applet.Applet;
import java.awt.*;

public class Marquees extends Applet implements Runnable {

    Thread t;
    int x,y,f;
    String msg;

    @Override
    public void init() {
       x = 10;
       y = 100;
       f =5;
       msg = "this is a growing marquee";
    }

    @Override
    public void run() {
        for(;;){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    @Override
    public void start() {
       t = new Thread(this);
       t.start();
    }


    @Override
    public void stop() {
        t.stop();
    }

    @Override
    public void paint(Graphics g) {
        Font newFont = new Font("TimesRoman",Font.BOLD,f);
        g.setFont(newFont);
        FontMetrics fontMetrics = g.getFontMetrics();
        int width = fontMetrics.stringWidth(msg);
        g.drawString(msg,x,y);
        f+= 2;
        if(f>50)
            f=2;
    }
}
/*
    <html>
        <body>
            <applet code="Marquees.class" width=400 height=400>
            </applet>
        </body>
    </html>
 Save marquee.html /run method: >appletviewer marquee.html*/
