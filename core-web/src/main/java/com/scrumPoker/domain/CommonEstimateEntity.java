package com.scrumPoker.domain;

import javax.persistence.MappedSuperclass;

/**
 * Have two fields, that need for several main classes.
 * @author Maxim Korkuts
 */
@MappedSuperclass
public abstract class CommonEstimateEntity extends CommonStatusAndTimeEntity {

    /**
     * Final summary estimate for all tasks in this issue.
     */
    private Double estimate;

    /**getters and setters*/
    public Double getEstimate() {
        return estimate;
    }

    public void setEstimate(Double estimate) {
        this.estimate = estimate;
    }
}
