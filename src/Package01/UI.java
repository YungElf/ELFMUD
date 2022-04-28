package Package01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class UI {

    JFrame window;
    JPanel titlenamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel;
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    Font titlefont = new Font("Comic Sans", Font.PLAIN, 90);
    Font normalfont = new Font("Times New Roman", Font.PLAIN, 25);

    public void createUI(Game.ChoiceHandler cHandler) {

        //Window
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);


        //Title Screen
        titlenamePanel = new JPanel();
        titlenamePanel.setBounds(100,100,600,500);
        titlenamePanel.setBackground(Color.BLACK);
        titleNameLabel = new JLabel("ELFMUD");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titlefont);
        titlenamePanel.add(titleNameLabel);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300,400,200,100);
        startButtonPanel.setBackground(Color.black);
        startButton = new JButton("Start");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalfont);
        startButtonPanel.add(startButton);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("start");
        window.add(titlenamePanel);
        window.add(startButtonPanel);

        //Game Screen

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("This is the main text area");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalfont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        window.add(choiceButtonPanel);

        choice1= new JButton("choice1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalfont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);
        choice2= new JButton("choice2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalfont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);
        choice3= new JButton("choice3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalfont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);
        choice4= new JButton("choice4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalfont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(cHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100,15,600,50);
        playerPanel.setBackground(Color.BLACK);
        playerPanel.setLayout(new GridLayout(1,4));
        window.add(playerPanel);

        hpLabel = new JLabel("HP");
        hpLabel.setFont(normalfont);
        hpLabel.setForeground(Color.WHITE);
        playerPanel.add(hpLabel);
        hpNumberLabel = new JLabel("");
        hpNumberLabel.setForeground(Color.WHITE);
        hpNumberLabel.setFont(normalfont);
        playerPanel.add(hpNumberLabel);
        weaponLabel = new JLabel("Weapon");
        weaponLabel.setForeground(Color.WHITE);
        weaponLabel.setFont(normalfont);
        playerPanel.add(weaponLabel);
        weaponNameLabel = new JLabel();
        weaponNameLabel.setForeground(Color.WHITE);
        weaponNameLabel.setFont(normalfont);
        playerPanel.add(weaponNameLabel);






        window.setVisible(true);



    }
}