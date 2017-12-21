package com.fast.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Settings {
//Load properties files
	
	private static Properties properties=loadPropertyFiles();
	
	public static Properties getInstance()
	{
		return properties;
	}
	
	public static Properties loadPropertyFiles()
	{
		Parameters parameters=new Parameters().getInstance();
		if(parameters.getRelativePath()==null)
		{
			throw new AutoError("Path set is not correct");
		}else
		{
			Properties properties=new Properties();
		try
		{
			
		
				properties.load(new FileInputStream(parameters.getRelativePath()+System.getProperty("file.seperator")+"Global.properties") );
			
			
			return properties;
			
		}catch(FileNotFoundException e)
		{
			System.out.println(e);
			throw new AutoError("Framework could not recognize File");
		}
		catch(IOException e)
		{System.out.println(e);
		throw new AutoError("System generated error");
			}
		}
		
	}

}
