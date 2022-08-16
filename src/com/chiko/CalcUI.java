package com.chiko;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.EventListener;

public class CalcUI extends JFrame {
    JTextField text;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bAdd, bSub, bMul, bDiv, bEquals, bReset, bDot, bBack;
//    Icon backspace;
    public CalcUI(){
        super("Calculator");

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bAdd = new JButton("+");
        bSub = new JButton("-");
        bMul = new JButton("*");
        bDiv = new JButton("/");
        bEquals = new JButton("Equals");
        bReset = new JButton("Reset");
        bDot = new JButton(".");
//        backspace = new ImageIcon("./resources/backspace.png");
        bBack = new JButton("Backspace");
        text = new JTextField();

        b1.setPreferredSize(new Dimension(90, 50));
        b2.setPreferredSize(new Dimension(90, 50));
        b3.setPreferredSize(new Dimension(90, 50));
        b4.setPreferredSize(new Dimension(90, 50));
        b5.setPreferredSize(new Dimension(90, 50));
        b6.setPreferredSize(new Dimension(90, 50));
        b7.setPreferredSize(new Dimension(90, 50));
        b8.setPreferredSize(new Dimension(90, 50));
        b9.setPreferredSize(new Dimension(90, 50));
        b0.setPreferredSize(new Dimension(90, 50));
        bAdd.setPreferredSize(new Dimension(90, 50));
        bSub.setPreferredSize(new Dimension(90, 50));
        bMul.setPreferredSize(new Dimension(90, 50));
        bDiv.setPreferredSize(new Dimension(90, 50));
        bEquals.setPreferredSize(new Dimension(90, 50));
        bDot.setPreferredSize(new Dimension(90, 50));
        bBack.setPreferredSize(new Dimension(90, 50));
        bReset.setPreferredSize(new Dimension(90, 50));
        text.setPreferredSize(new Dimension(279, 50));

        add(text);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b7);
        add(b8);
        add(b9);
        add(bAdd);
        add(b0);
        add(bDot);
        add(bSub);
        add(bMul);
        add(bDiv);
        add(bReset);
        add(bBack);
        add(bEquals);

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "0");
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "1");
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "2");
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "3");
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "4");
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "5");
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "6");
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "7");
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "8");
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "9");
            }
        });

        bAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "+");
            }
        });

        bSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "-");
            }
        });

        bMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "*");
            }
        });

        bDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + "/");
            }
        });

        bEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//          Implement the equals logic
            }
        });

        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '+') && (c != '-') && (c != '*') && (c != '/') && (c != '.') && (c != '=')){
                    e.consume();
                }
            }
        });

        bDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + ".");
            }
        });

        bReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
            }
        });

        bBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText().substring(0, text.getText().length()-1));
            }
        });

        setLayout(new FlowLayout());
        setSize(300, 430);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
