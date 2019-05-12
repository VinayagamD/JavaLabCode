package com.vinay.labcode.applet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChkBox extends Applet implements ItemListener {

    Checkbox cb1,cb2,cb3;
    String msg =  " ";


    @Override
    public void init() {
        cb1 = new Checkbox("Science");
        cb2 = new Checkbox("Management");
        cb3 = new Checkbox("Arts");
        add(cb1);
        add(cb2);
        add(cb3);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
    }

    @Override
    public void paint(Graphics g) {
        msg = "Current State:";
        g.drawString(msg,6,80);
        msg = "Science  : "+cb1.getState();
        g.drawString(msg,6,100);
        msg = "Management : "+cb2.getState();
        g.drawString(msg,6,120);
        msg = "Arts     : "+cb3.getState();
        g.drawString(msg, 6, 140);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }
}

/*
    <html>
        <body>
            <applet code=ChkBox.class width=400 height=400>
            </applet>
        </body>
    </html>
 Save chkbox.html /run method: >appletviewer chkbox.html*/