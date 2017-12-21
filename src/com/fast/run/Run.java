package com.fast.run;

import java.util.List;

import com.fast.core.ResultManager;
import com.fast.core.TestParameters;

public class Run extends ResultManager{

	private List<TestParameters> testParameters;
	
	public static void main(String[] args) {
		Run run=new Run();
		run.startExecution();
	}
	
	public void startExecution()
	{
		setRelativePath();
		initialise();
		setBasicInfo();
	}
	
	public void setBasicInfo()
	{
		testParameters=getDetails(properties.getProperty("runType"));
	}
	
	public List<TestParameters> getDetails(String sheetName)
	{
		List<TestParameters> testParam;
		return testParam;
	}
}
