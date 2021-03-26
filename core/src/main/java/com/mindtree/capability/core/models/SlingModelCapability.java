package com.mindtree.capability.core.models;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mindtree.capability.core.bean.SlingCapabilityEntity;
import com.mindtree.capability.core.services.SlingCapabilityService;

@Model(adaptables = Resource.class)
public class SlingModelCapability {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Inject
	private String fileReference;

	@Inject
	private String text;

	@Inject
	private String textdescription;

//	@Inject
//	private List<String> description;

	@Inject
	private SlingCapabilityService service;

	private String imageLoggerMessage;
	private String textLoggerMessage;
//	private String multifieldLoggerMessage;
	private String message;

	private List<SlingCapabilityEntity> city = new ArrayList<SlingCapabilityEntity>();

	@PostConstruct
	public void init() {
		
		logger.info("in SlingModelCapability.class");
		this.imageLoggerMessage = " Image Path:=" + this.fileReference;
		logger.info(imageLoggerMessage);
		this.textLoggerMessage = "Text: " + this.text + " Text Description: " + this.textdescription;
		logger.info(textLoggerMessage);
//		if(description !=null) {
//			this.multifieldLoggerMessage = "Mutifield first element: " + description.get(0);
//			logger.info(multifieldLoggerMessage);
//		}
//		else {
//			logger.info("list has no data");
//		}

		city = service.activate();
		if (city != null) {
			logger.info("there is some data in citylist");
		}

		message = "all is things are compleated"+ "\tCurrent page is: ";
		
	}

	public List<SlingCapabilityEntity> getCity() {
		return city;
	}

	public String getMessage() {
		return message;
	}	

}
