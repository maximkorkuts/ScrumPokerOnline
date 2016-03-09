package com.scrumPoker.controller;

import com.scrumPoker.domain.User;
import com.scrumPoker.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Maxim Korkuts
 * Controller to manage users in application.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    /**
     * GET /create  --> Create a new user and save it in the database.
     */
    @RequestMapping("/create")
    @ResponseBody
    public String create(User user) {
        String userId = "";
        try {
            if (userService.isExist(user.getLogin())) {
                userService.save(user);
                userId = String.valueOf(user.getId());
            }
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created with id = " + userId;
    }

    /**
     * GET /delete  --> Delete the user having the passed id.
     */
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(String login) {
        try {
            if (userService.isExist(login)) {
                userService.delete(login);
            }
        }
        catch (Exception ex) {
            return "Error deleting the user:" + ex.toString();
        }
        return "User succesfully deleted!";
    }

    /**
     * POST /update  --> Update the email and the name for the user in the
     * database having the passed id.
     */
    @RequestMapping("/update")
    @ResponseBody
    public String updateUser(User userDto) {
        try {
            if (userService.isExist(userDto.getLogin())) {
                userService.save(userDto);
            }

        }
        catch (Exception ex) {
            return "Error updating the user: " + ex.toString();
        }
        return "User succesfully updated!";
    }


}
