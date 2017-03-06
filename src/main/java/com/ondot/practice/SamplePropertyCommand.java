package com.ondot.practice;

import com.ondot.utils.AutoConstants;
import com.ondot.utils.PropHandlerz;

public class SamplePropertyCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(System.getProperty(AutoConstants.ProjectDir.ProjDir)+"\\OR.properties");
		System.out.println(PropHandlerz.fetchProp(AutoConstants.URL.URL));

	}

}
