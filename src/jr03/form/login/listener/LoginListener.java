/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jr03.form.login.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import jr03.form.MainForm;
import jr03.form.login.LoginForm;

/**
 *
 * @author student2
 */
public class LoginListener implements ActionListener{

     private final JTextField txtUsername;
        private final JPasswordField txtPassword;
        private final LoginForm loginForm;

    public LoginListener(LoginForm loginForm, JTextField txtUsername, JPasswordField txtPassword) {
        this.loginForm = loginForm;
        this.txtUsername = txtUsername;
        this.txtPassword = txtPassword;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // uzmi vrednost iz login polja
        String username = txtUsername.getText().trim();
        String password = String.valueOf(txtPassword.getPassword());
        
        //otvori glavnu formu;
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Uneli ste prazno ime", "Error", JOptionPane.ERROR_MESSAGE);
            loginForm.dispose();
            return;
        }
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Uneli ste praznu sifru", "Error", JOptionPane.ERROR_MESSAGE);
            loginForm.dispose();
            return;
        }
        //zatvori login formu
        
        
        JFrame mainForm = new MainForm(null);
        mainForm.setVisible(true);
    }
    
}
