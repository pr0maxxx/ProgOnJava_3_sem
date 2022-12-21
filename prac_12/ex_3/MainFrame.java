package ru.maksim.ikbo2021.new_pracs.prac_12.ex_3;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import java.awt.*;


public class MainFrame extends JFrame {

    private JLabel imgLabel;
    private int imgNum = 1;

    private MainFrame(){
        this.setSize(400, 450);
        imgLabel = new JLabel(new ImageIcon("1.jpg"), SwingConstants.CENTER);
        getContentPane().add(imgLabel);

        Timer timer = new Timer(150, e -> nextImg());
        timer.start();
    }
    private void nextImg(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource((++imgNum)+".jpg"));
        Image image= imageIcon.getImage().getScaledInstance(500, 700, Image.SCALE_SMOOTH);
        imageIcon=new ImageIcon(image);
        imgLabel.setIcon(imageIcon);
        if(imgNum == 8) imgNum = 0;

    }

    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);

    }
}