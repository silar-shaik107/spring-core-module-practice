package com.springboot.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan(basePackages= {"com.springboot.component","com.springboot.cofig"})
//@ComponentScan("com.springboot.component")
@Configuration
public class springbeancomponentconfig {
	//by defining class as a @Component we can create only one object
    //if we want more than one Bean object in @Component class, 
	//we should use Bean method again 	
	@Bean("emp1")
          Employee getEmployee() {
        	  return new Employee();
          }
}
