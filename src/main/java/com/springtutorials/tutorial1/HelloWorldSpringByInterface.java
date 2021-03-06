package com.springtutorials.tutorial1;

import com.springtutorials.tutorial1.services.DummyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author amit@springtutorials.com
 */
public class HelloWorldSpringByInterface {

    public static void main(String[] args){
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext("com.springtutorials.tutorial1");
        System.out.println(" Spring Tutorial 1: Hello World config within this class and by interface ");
        //DummyService dummyService = new DummyServiceImpl();
        DummyService dummyService = ctx.getBean(DummyService.class);
        System.out.println(" DummyService returned: "+dummyService.test());
    }

}
