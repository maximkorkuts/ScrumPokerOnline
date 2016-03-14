package com.scrumPoker.dto;

/**
 * DTO object of User class. Use for registration and account editing information.
 * @author Maxim Korkuts
 */
public class UserDto {

    private String firstName;

    private String lastName;

    private String login;

    private String password;

    private String email;

    /**getters and setters*/
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
