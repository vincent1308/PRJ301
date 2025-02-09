/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.UserDAO;
import dto.UserDTO;

/**
 *
 * @author npsan
 */
public class UserTest {
    public static void main(String[] args) {
        UserDTO u1 = new UserDTO("TLN01", "Ban", "AD", "khong_co_pass");
        UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.create(u1));
        
        for (int i = 0; i < 20; i++) {
            UserDTO ui = new UserDTO("USER"+i, "Nguyen "+i, "US", i+"");
            userDAO.create(ui);
        }
    }
}
