package com.fast.core;

public class Parameters {
	
	public String relativePath;
	public String runType;
	
	private static final Parameters parameters = new Parameters();
	public String getRelativePath() {
		return relativePath;
	}

	public void setRelativePath(String relativePath) {
		this.relativePath = relativePath;
	}
	
	public static Parameters getInstance()
	{
		return parameters;
	}

	public String getRunType() {
		return runType;
	}

	public void setRunType(String runType) {
		this.runType = runType;
	}
	
	
}
