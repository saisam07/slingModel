package com.mindtree.capability.core.services;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mindtree.capability.core.bean.SlingCapabilityEntity;
import com.mindtree.capability.core.dao.SlingCapabilityDao;
import com.mindtree.capability.core.dao.SlingCapabilityDaoImpl;

@Component(service = SlingCapabilityService.class, immediate = true)
public class SlingCapabilityServiceImpl implements SlingCapabilityService{

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	public List<SlingCapabilityEntity> activate() {
		logger.info("inside the ProductTileDataServiceImpl class");
		
		List<SlingCapabilityEntity> data= new ArrayList<SlingCapabilityEntity>();
		SlingCapabilityDao dao= new SlingCapabilityDaoImpl();
		data=dao.getdata();
		return data;
	}

}
