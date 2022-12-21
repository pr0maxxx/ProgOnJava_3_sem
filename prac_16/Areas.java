package ru.maksim.ikbo2021.new_pracs.prac_16;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Areas extends JFrame {
    public Areas() {
        super("TextAreas");
        this.setSize(1080, 720);
        this.setLayout(new BorderLayout());
        JPanel center = new JPanel();
        center.setLayout(new GridBagLayout());
        this.add(center, "Center");
        center.add(new JLabel("CAO"));
        JPanel west = new JPanel();
        west.setLayout(new GridBagLayout());
        this.add(west, "West");
        west.add(new JLabel("ZAO"));
        JPanel south = new JPanel();
        south.setLayout(new GridBagLayout());
        this.add(south, "South");
        south.add(new JLabel("UAO"));
        JPanel north = new JPanel();
        north.setLayout(new GridBagLayout());
        this.add(north, "North");
        north.add(new JLabel("SAO"));
        JPanel east = new JPanel();
        east.setLayout(new GridBagLayout());
        this.add(east, "East");
        east.add(new JLabel("VAO"));
        final Integer[] mouse_prev_position = new Integer[]{0};
        center.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] != 1) {
                    JOptionPane.showMessageDialog(Areas.this.getContentPane(), "Good job.", "Welcome to the CAO", -1);
                    mouse_prev_position[0] = 1;
                }
            }

            public void mouseExited(MouseEvent e) {
            }
        });
        west.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] != 2) {
                    JOptionPane.showMessageDialog(Areas.this.getContentPane(), "Good job.", "Welcome to the ZAO", -1);
                    mouse_prev_position[0] = 1;
                }
            }

            public void mouseExited(MouseEvent e) {
            }
        });
        south.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] != 3) {
                    JOptionPane.showMessageDialog(Areas.this.getContentPane(), "Good job.", "Welcome to the UAO", -1);
                    mouse_prev_position[0] = 1;
                }
            }

            public void mouseExited(MouseEvent e) {
            }
        });
        north.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] != 4) {
                    JOptionPane.showMessageDialog(Areas.this.getContentPane(), "Good job.", "Welcome to the SAO", -1);
                    mouse_prev_position[0] = 1;
                }
            }

            public void mouseExited(MouseEvent e) {
            }
        });
        east.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] != 5) {
                    JOptionPane.showMessageDialog(Areas.this.getContentPane(), "Good job.", "Welcome to the VAO", -1);
                    mouse_prev_position[0] = 1;
                }
            }

            public void mouseExited(MouseEvent e) {
            }
        });
    }

    public static void main(String[] args) {
        (new Areas()).setVisible(true);
    }
}
