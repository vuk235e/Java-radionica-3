/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jr03.repository;

import jr03.domain.User;

/**
 *
 * @author student2
 */
public interface UserRepository {
    User login(User u) throws Exception;
}
