package com.springtutorials.tutorial1;

import com.springtutorials.tutorial1.services.DummyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author amit@springtutorials.com
 */
public class HelloWorldSpring {

    public static void main(String[] args){
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext("com.springtutorials.tutorial1");
        System.out.println(" Spring Tutorial 1: Hello World config within this class ");
        //DummyService dummyService = new DummyServiceImpl();
        DummyService dummyService = (DummyService) ctx.getBean("dummyServiceImpl");
        System.out.println(" DummyService returned: "+dummyService.test());
    }

}
