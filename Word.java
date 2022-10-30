/*demo gui app    */

package word;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.*;
import java.awt.event.*;
//noting 
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Word implements ActionListener{
    JFrame f;
    JPanel p;
    JButton effacer, bold, italic, plain;
    JLabel coulour, taille, police;

    JComboBox<String> clrList;

    JComboBox<String> tailleList;
    JComboBox<String> policeList;
    String[] chClr = { "green",
            "purple",
            "red", "white", "blue" };
    String[] tailleArr = { "10", "12", "17", "24", "30" };
    String[] policeArr = { "Time New Roman", "Monoscape", "Roboto" };
    JTextArea t;
    GroupLayout layout;

    Word() {
        f = new JFrame("OpenWord");
        p = new JPanel();
        clrList = new JComboBox<String>(chClr);
        policeList = new JComboBox<String>(policeArr);
        tailleList = new JComboBox<String>(tailleArr);
        Dimension d = new Dimension(150, 30);
        tailleList.setMinimumSize(d);
        policeList.setMinimumSize(d);
        clrList.setMinimumSize(d);

        coulour = new JLabel("couleurs :");
        taille = new JLabel("Taille :");
        police = new JLabel("Police :");

        effacer = new JButton("Effacer");
        bold = new JButton("Bold");
        italic = new JButton("Italic");
        plain = new JButton("Plain");
        bold.addActionListener(this);

        t = new JTextArea();

        layout = new GroupLayout(p);
        p.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(t)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(coulour)
                                .addComponent(clrList)
                                .addComponent(taille)
                                .addComponent(tailleList))

                        .addGroup(layout.createSequentialGroup()
                                .addComponent(police)
                                .addComponent(policeList)
                                .addComponent(effacer)
                                .addComponent(bold)
                                .addComponent(italic)
                                .addComponent(plain))

        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(t))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(coulour)
                                .addComponent(clrList)
                                .addComponent(taille)
                                .addComponent(tailleList))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(police)
                                .addComponent(policeList)
                                .addComponent(effacer)
                                .addComponent(bold)
                                .addComponent(italic)
                                .addComponent(plain)));
        Dimension dp = new Dimension(700, 500);
        f.setMinimumSize(dp);
        f.pack();
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void showGuiWord(){

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bold) {
            Font font = new Font("Serif",Font.BOLD,20);
            String s = t.getText();
            t.setFont(font);
            t.setText(s);
        }
    }
    public static void main(String[] args) {
        Word w = new Word();
    }

}
