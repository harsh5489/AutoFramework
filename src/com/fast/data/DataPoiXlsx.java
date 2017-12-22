package com.fast.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fast.layout.DataManipulation;
import com.fast.layout.ExcelManipulation;

public class DataPoiXlsx implements DataManipulation,ExcelManipulation{

	@Override
	public void intializeFile(String path,String sheetName) {
		try {
		File file=new File(path);
	
			FileInputStream fileInput=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fileInput);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void setData() {
		
		
	}

	@Override
	public void getData() {
		
		
	}

	@Override
	public void getRowNum() {

		
	}

	@Override
	public void getColNum() {
	
		
	}

	@Override
	public void getRowCount() {
		
		
	}

	@Override
	public void intializeFile() {
		// TODO Auto-generated method stub
		
	}



}
