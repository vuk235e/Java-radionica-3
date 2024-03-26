/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jr03.repository.impl;

import jr03.domain.User;
import jr03.repository.UserRepository;

/**
 *
 * @author student2
 */
public class ListUserRepository implements UserRepository{

    private User[] users;
    
    public ListUserRepository() {
        users = new User[3];
        users[0] = new User("Ana", "ana", "Ana", "Anic");
        users[0] = new User("Ans", "ans", "Ans", "Anis");

    }
    
    @Override
    public User login(User user) throws Exception {
        for (User user1 : users) {
            if (user.equals(user1)) {
                return user1;
            }
        }
        throw new Exception("User does not exist!");
    }
    
}
