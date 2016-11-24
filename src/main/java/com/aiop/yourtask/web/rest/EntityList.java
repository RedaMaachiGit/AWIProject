/*
 * 
 */
package com.aiop.yourtask.web.rest;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.aiop.yourtask.domain.Product;

// TODO: Auto-generated Javadoc
/**
 * The Class EntityList.
 *
 * @param <T> the generic type
 */
@XmlRootElement
@XmlSeeAlso({Product.class})
public class EntityList<T> {

 /** The list of entity objects. */
 private List<T> listOfEntityObjects;

    /**
     * Instantiates a new entity list.
     */
    public EntityList() {
        listOfEntityObjects = new ArrayList<T>();
    }

    /**
     * Instantiates a new entity list.
     *
     * @param listOfEntityObjects the list of entity objects
     */
    public EntityList(List<T> listOfEntityObjects) {
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