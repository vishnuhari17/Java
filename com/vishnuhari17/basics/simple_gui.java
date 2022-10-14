package com.vishnuhari17.basics;

import javax.swing.*;

public class simple_gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You are "+age+" years old");

        double hight = Double.parseDouble(JOptionPane.showInputDialog("Enter your hight"));
        JOptionPane.showMessageDialog(null,"You are "+hight+" cm tall");


    }
}