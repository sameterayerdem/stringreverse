package org.sameterayerdem.example;

import java.lang.annotation.Annotation;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements org.sameterayerdem.example.Service{

	public String convert(String value)
	{	char [] cs = new  char[value.length()];

	
	for(int i=value.length()-1;i>=0;i--)
	{
		cs[value.length()-i-1]=value.charAt(i);
		
	}	
		return new String(cs);	
	}

	

}
