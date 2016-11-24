/*
 * 
 */
package com.aiop.yourtask.web.rest;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.aiop.yourtask.domain.Yourtaskuser;

// TODO: Auto-generated Javadoc
/**
 * The Class EntityListCompany.
 *
 * @param <T> the generic type
 */
@XmlRootElement
@XmlSeeAlso({Yourtaskuser.class})
public class EntityListCompany<T> {

 /** The list of entity objects. */
 private List<T> listOfEntityObjects;

    /**
     * Instantiates a new entity list company.
     */
    public EntityListCompany() {
        listOfEntityObjects = new ArrayList<T>();
    }

    /**
     * Instantiates a new entity list company.
     *
     * @param listOfEntityObjects the list of entity objects
     */
    public EntityListCompany(List<T> listOfEntityObjects) {
        this.listOfEntityObjects = listOfEntityObjects;
    }

    /**
     * Gets the items.
     *
     * @return the items
     */
    @XmlAnyElement
    public List<T> getItems() {
        return listOfEntityObjects;
    }
}