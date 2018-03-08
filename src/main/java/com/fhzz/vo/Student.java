package com.fhzz.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired  
    private Environment env;  
  
    public void speak() {  
        System.out.println("=========>" + env.getProperty("test.value"));  
    }  
}
