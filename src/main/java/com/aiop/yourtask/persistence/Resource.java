package com.aiop.yourtask.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="resource")
public class Resource {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="resourceId")
	private int resourceId;

	@Column(name="resourceUrl")
	private String resourceUrl;
	
	
	public Resource() {}


	public Resource(int resourceId, String resourceUrl) {
		this.resourceId = resourceId;
		this.resourceUrl = resourceUrl;
	}


	public Resource(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}


	public int getResourceId() {
		return resourceId;
	}


	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}


	public String getResourceUrl() {
		return resourceUrl;
	}


	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}


	@Override
	public String toString() {
		return "Resource [resourceId=" + resourceId + ", resourceUrl=" + resourceUrl + "]";
	}
	
	

}