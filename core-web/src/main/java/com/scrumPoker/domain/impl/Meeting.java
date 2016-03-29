package com.scrumPoker.domain.impl;

import com.scrumPoker.domain.CommonTimeEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Main entity for scrum poker. User create meeting before
 * @author Maxim Korkuts
 */
@Entity
@Table(name = "meeting")
public class Meeting extends CommonTimeEntity {

}
