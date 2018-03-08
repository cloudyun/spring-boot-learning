package com.fhzz.vo;

import org.springframework.beans.factory.annotation.Value;    
import org.springframework.context.annotation.PropertySource;    
import org.springframework.stereotype.Component;    
    
@Component    
@PropertySource("classpath:config/jdbc/jdbc.properties")//如果是application.properties，就不用写@PropertyScource("application.properties")，其他名字用些    
public class Jdbc {    
        
    @Value("${user}")  
    private String user;    
        
    @Value("${password}")   
    private String password;    
        
    public void speack(){    
        System.out.println("username:"+user+"------"+"password:"+password);    
    }    
    
} 