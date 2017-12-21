package com.fast.core;

import java.io.File;
import java.util.Properties;

public class ResultManager {

	
	protected Properties properties;
	public Parameters parameters =
			Parameters.getInstance();
	
	
	public void setRelativePath()
	{
		String relativePath = new File(System.getProperty("user.dir")).getAbsolutePath();
		if(relativePath.contains("supportlibraries")) {
			relativePath = new File(System.getProperty("user.dir")).getParent();
	}
		parameters.setRelativePath(relativePath);
	}
	
	
	public void initialise()
	{
	properties=Settings.getInstance();
	}
	}
