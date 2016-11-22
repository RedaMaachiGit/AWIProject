package com.aiop.yourtask.web.rest;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.aiop.yourtask.domain.Yourtaskuser;

@XmlRootElement
@XmlSeeAlso({Yourtaskuser.class})
public class EntityListCompany<T> {

 private List<T> listOfEntityObjects;

    public EntityListCompany() {
        listOfEntityObjects = new ArrayList<T>();
    }

    public EntityListCompany(List<T> listOfEntityObjects) {
        this.listOfEntityObjects = listOfEntityObjects;
    }

    @XmlAnyElement
    public List<T> getItems() {
        return listOfEntityObjects;
    }
}