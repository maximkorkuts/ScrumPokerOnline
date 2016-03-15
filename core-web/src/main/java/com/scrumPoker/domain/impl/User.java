package com.scrumPoker.domain.impl;

import com.scrumPoker.domain.Identifiable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Main class for User in system.
 * @author Maxim Korkuts
 */
@Entity
@Table(name = "user")
public class User implements Identifiable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * User email address, should be required, because it need to get invitation from other users.
     * Help to remind user password.
     */
    @NotNull
    private String email;

    /**
     * First name and last name. Will be shown for user and for his team friends.
     * If this two fields is empty, so will be shown in all cases login.
     */
    private String firstName;

    private String lastName;

    /**
     * User login. Need for authentication in application.
     */
    @NotNull
    private String login;

    /**
     * User password. Need for authentication in application and secure user data.
     * If user need to change it, he should write old password and then create a new one.
     * Save in DB in coded string value.
     */
    @NotNull
    private String password;

    /**
     * Unique value for user and his session. Will generated when session is created.
     */
    private String token;

    /**getters and setters*/
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
