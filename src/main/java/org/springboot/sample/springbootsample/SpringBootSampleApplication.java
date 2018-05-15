package org.springboot.sample.springbootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ServletComponentScan
public class SpringBootSampleApplication {

//	public ServletRegistrationBean servletRegistrationBean(){
//		return new ServletRegistrationBean(new MyServlet(),"/xs/*");
//	}
	//ceshi
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleApplication.class, args);
	}
}

