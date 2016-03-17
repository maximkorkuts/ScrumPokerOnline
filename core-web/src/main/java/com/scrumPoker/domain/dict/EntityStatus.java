package com.scrumPoker.domain.dict;

/**
 * Status in what can be entity during estimating. From create moment to closed moment.
 * @author Maxim Korkuts
 */
public enum EntityStatus {

    CREATED,        //This status use when entity was created.
    IN_PROGRESS,    //This status use when entity was created and somebody put at least one estimate.
    FINISHED,       //This status use when entity was close auto, because all estimates was marked.
    CLOSED;         //This status use when entity was close and not all estimates was marked(Can be closed only by Moderator).
}
