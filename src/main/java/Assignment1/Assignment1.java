/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author Larry Jackson
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Assignment1 implements ActionListener {
    
        private static JLabel userLabel;
        private static JTextField userText;
        private static JLabel passwordLabel;
        private static JPasswordField passwordText;
        private static JButton button;
        private static JLabel success;
        
    public static void main(String[] args) {
        
        //Creates the windows form
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        
        panel.setLayout(null);
        
        //Add a label named User
        userLabel = new JLabel("User: ");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        
        //Add a text box for the user to enter their username 
        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        
        //Add a label named Password
        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        
        //Adds a text box to enter the password
        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);
        
        //Adds the login button
        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new Assignment1());
        panel.add(button);
        
        //Show if the user successfully login 
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        
        
        frame.setVisible(true);
    }

    @Override
    //This action peformed will check the username and password and make sure it is valid
    public void actionPerformed(ActionEvent arg0) {
        String user = userText.getText();
        String password = passwordText.getText();
        
        if(user.equals("John") && password.equals("myPassword")){
            success.setText("You have been logged in");
        }
        //if the user puts in the wrong password and or username this message will put up on the success label
        else {
            success.setText("Sorry, that password is not valid");
        }
    }
}
