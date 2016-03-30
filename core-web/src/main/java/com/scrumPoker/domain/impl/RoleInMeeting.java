package com.scrumPoker.domain.impl;

import com.scrumPoker.domain.CommonIdentifyEntity;
import com.scrumPoker.domain.dict.RoleType;

import javax.persistence.*;

/**
 * Entity that resolve dependency between User and Meeting.
 * Control user role in this Meeting.
 * @author Maxim Korkuts
 */
@Entity
@Table(name = "role")
public class RoleInMeeting extends CommonIdentifyEntity {

    /**
     * User entity.
     */
    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

    /**
     * User role in meeting.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="role_type")
    private RoleType roleType;

    /**
     * Meeting entity.
     */
    @ManyToOne
    @JoinColumn(name = "id_meeting")
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
