package com.mindtree.capability.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class)
public class GetFilePath {

	@Inject
	private String name;
	
	
	private String formatedPath;

	@PostConstruct
	public void init() {
		this.formatedPath = this.name;
		
	}

	public String getFormatedPath() {
		return formatedPath;
	}

}
