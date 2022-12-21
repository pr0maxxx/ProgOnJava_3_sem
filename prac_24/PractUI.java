package ru.maksim.ikbo2021.new_pracs.prac_24;

import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PractUI extends JFrame {
    IDocument currentDocument;
    ICreateDocument fabricDocument;

    public PractUI() {
        super("Show Text Document");
        this.setSize(540, 360);
        this.fabricDocument = new CreateTextDocument();
        this.currentDocument = this.fabricDocument.CreateNew("DocFolder1", "Doc1", 90);
        JTextArea textArea = new JTextArea();
        this.add(textArea);
        JMenuBar menuBarMain = new JMenuBar();
        menuBarMain.setBackground(Color.WHITE);
        JMenu menuFile = new JMenu("File");
        JMenuItem itemNew = new JMenuItem("New");
        JMenuItem itemOpen = new JMenuItem("Open");
        JMenuItem itemSave = new JMenuItem("Save");
        JMenuItem itemExit = new JMenuItem("Exit");
        menuFile.add(itemNew);
        menuFile.add(itemOpen);
        menuFile.add(itemSave);
        menuFile.add(itemExit);
        menuBarMain.add(menuFile);
        this.setJMenuBar(menuBarMain);
        itemNew.addActionListener((e) -> {
            textArea.setText("");
            String stDocumentName = JOptionPane.showInputDialog("Enter document name");
            if (stDocumentName != null) {
                String stDocumentFolder = JOptionPane.showInputDialog("Enter document folder");
                if (stDocumentFolder != null) {
                    this.currentDocument = this.fabricDocument.CreateNew(stDocumentFolder, stDocumentName, (new Random()).nextInt(1, 100));
                }
            }
        });
        itemOpen.addActionListener((e) -> {
            String documentName = JOptionPane.showInputDialog("Enter file name");
            if (documentName != null) {
                this.currentDocument = this.fabricDocument.CreateOpen(documentName);
                textArea.setText(this.currentDocument.getContent());
            }
        });
        itemSave.addActionListener((e) -> {
            JOptionPane.showMessageDialog(this.getContentPane(), "Document was saved");
            this.currentDocument.setContent(textArea.getText().toString());
        });
        itemExit.addActionListener((e) -> {
            this.dispose();
        });
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new PractUI();
    }
}
