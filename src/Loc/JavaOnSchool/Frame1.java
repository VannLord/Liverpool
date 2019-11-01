package Loc.JavaOnSchool;

import javax.swing.*;
import java.awt.*;

public class Frame1 extends JFrame {
    public static void main(String[] args) {
        Frame1 f = new Frame1();
        f.setTitle("Chao u !");
        f.setBounds(200,500,700,700);
        f.setLayout(new FlowLayout());
        f.add(new JButton("OK"));
        f.add(new JButton("Cancel"));

        f.add(new JLabel("Day la Label"));
        f.add(new JTextField(7));
        f.add(new JTextArea(5,30));

        f.add(new Checkbox("Sport"));
        f.add(new Checkbox("Music"));
        f.add(new Checkbox("Travel"));
        CheckboxGroup cg = new CheckboxGroup();
        f.add(new Checkbox("Female",cg,true));
        f.add(new Checkbox("Male",cg,true));
        f.add(new Checkbox("Gei",cg,true));
        f.add(new Checkbox("Les",cg,true));

        Choice ch = new Choice();
        ch.addItem("Support");
        ch.addItem("Music");
        ch.addItem("Travel");
        f.add(ch);

        List list = new List(3,false);
        list.add("Music");
        list.add("Music");
        list.add("abc");
        list.add("Telen");
        f.add(list);
        f.setVisible(true);
    }
}
