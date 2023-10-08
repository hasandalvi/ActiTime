package com.actiTime.Genericliabrary;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListenerImplementation extends Baseclass implements ITestListener{

	

	@Override
	public void onTestFailure(ITestResult result) {
		String name =result.getName();
		TakesScreenshot t=(TakesScreenshot) driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshot/"+name+".png");
		 try {
			 Files.copy(src, dest);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	

}
