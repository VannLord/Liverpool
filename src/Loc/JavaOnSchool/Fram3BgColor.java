package Loc.JavaOnSchool;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fram3BgColor extends Frame implements ActionListener {
    Panel pn,pn1,pn2;
    Button red,green,blue,exit;

    public void GUI() {
        red = new Button("RED");
        green = new Button("GREEN");
        blue = new Button("BLUE");
        exit = new Button("EXIT");

        pn1 = new Panel(new GridLayout(1,3));
        pn2 = new Panel(new FlowLayout());
        pn = new Panel(new GridLayout(2,1));

        pn1.add(red);
        pn1.add(green);
        pn1.add(blue);

        pn2.add(exit);

        pn.add(pn1);
        pn.add(pn2);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        exit.addActionListener(this);

        add(pn);
        setSize(400,300);
        show();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== red)
        {
            setBackground(Color.RED);
            setVisible(false);
        }
        if(e.getSource()== green) pn.setBackground(Color.GREEN);
        if(e.getSource()== blue) pn.setBackground(Color.BLUE);
        if(e.getSource() == exit) System.exit(0);
    }
    public Fram3BgColor(String st)
    {
        super(st);
        GUI();
    }

    public static void main(String[] args) {
        new Fram3BgColor("Background Color");
    }
}
