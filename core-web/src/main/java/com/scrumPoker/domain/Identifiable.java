package com.scrumPoker.domain;

import java.io.Serializable;

/**
 * Identify entity, resolve id as main field.
 * @author Maxim Korkuts
 */
public interface Identifiable<T extends Serializable> {

    public T getId();

    public boolean isNew();

}
