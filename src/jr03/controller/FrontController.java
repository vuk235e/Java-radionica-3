/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jr03.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import jr03.domain.User;
import jr03.repository.UserRepository;
import jr03.repository.impl.ListUserRepository;

/**
 *
 * @author student2
 */
public class FrontController {
    private UserRepository userRepository;
    
    public FrontController() {
        userRepository = new ListUserRepository();
    }
    
    
    public User login(User user) throws Exception{
        try {
            return userRepository.login(user);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
}
