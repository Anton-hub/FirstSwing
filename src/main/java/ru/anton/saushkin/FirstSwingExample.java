package ru.anton.saushkin;

import javax.swing.*;

public class FirstSwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();//creating instance of JFrame

        frame.setSize(500,300);//400 width and 500 height
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);//making the frame visible
        frame.setSize(300, 300);

        JButton button = new JButton("click");//creating instance of JButton
        button.setBounds(5,5,100, 25);//x axis, y axis, width, height

        JTextField textField = new JTextField(10);
        textField.setBounds(110,5, 200, 25);

        frame.add(button);//adding button in JFrame
        frame.add(textField);

    }
}

//https://www.javatpoint.com/java-swing
