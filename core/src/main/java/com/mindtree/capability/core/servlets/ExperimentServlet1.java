package com.mindtree.capability.core.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mindtree.capability.core.dao.ProductInfoDao;
import com.mindtree.capability.core.dao.ProductInfoDaoImpl;

@Component(service = Servlet.class, property = {
		Constants.SERVICE_DESCRIPTION + "=JSON Servlet to read the data from the external webservice",
		"sling.servlet.methods=" + HttpConstants.METHOD_GET, "sling.servlet.paths=" + "/bin/AEMExperiment/dataServlet" })
public class ExperimentServlet1 extends SlingAllMethodsServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final Logger logger= LoggerFactory.getLogger(getClass());
	
	@Override
	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		logger.info("in servlet");
		response.setHeader("Content-Type", "text/html");
		response.getWriter().println("<h1>Servlet is called<h1>");
		response.getWriter().println("Data from Database");
		ProductInfoDao dao= new ProductInfoDaoImpl();
		List<String> productNameList=dao.getdata();
		if(productNameList == null) {
			logger.info("nothing is present in product list");
		}
		for(int i=0;i<productNameList.size();i++) {
			response.getWriter().println(productNameList.get(i));
			response.getWriter().println();
		}
		logger.info("At the end of servlet");
		response.getWriter().close();
	}
	
	
	
	

}
