package com.scrumPoker.domain;

import com.scrumPoker.domain.dict.RoleType;

/**
 * Entity that resolve dependency between User and Meeting.
 * Control user role in this Meeting.
 * @author Maxim Korkuts
 */
public class RoleInMeeting extends Identify {

    /**
     * User entity.
     */
    private User user;

    /**
     * User role in meeting.
     */
    private RoleType roleType;

    /**
     * Meeting entity.
     */
    private Meeting meeting;

    /**getters and setters*/
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }
}
