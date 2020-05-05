package gui;

import javax.swing.*;

public class Gui {

    JFrame jf;
    Draw d;

    public static int width = 800, height = 600;
    public static int xoff = 130, yoff = 20;

    public void create(){
        jf = new JFrame("Snake");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(width, height);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);

        d = new Draw();
        d.setBounds(0,0, width, height);
        d.setVisible(true);
        jf.add(d);

        //Wichtig für die Tastatureingabe
        jf.requestFocus();
        jf.setVisible(true);
    }
}
