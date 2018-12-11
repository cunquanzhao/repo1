package com.itheima.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
* <p>Title: SpringBootController</p>  
* <p>Description: </p>  
* @author zhaocq  
* @date 2018年8月31日
 */
@RestController
public class SpringBootController {
	
	 @RequestMapping("/hello2")
     public String sayHello(){
    	 return "success";
     }
	 
	 
	 @RequestMapping("/hello4")
     public String sayHello3(){
    	 return "success3333444";
     }
}
