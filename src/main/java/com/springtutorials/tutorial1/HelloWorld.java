package com.springtutorials.tutorial1;

import com.springtutorials.tutorial1.services.DummyService;
import com.springtutorials.tutorial1.services.DummyServiceImpl;

/**
 * @author amit@springtutorials.com
 */
public class HelloWorld {

    public static void main(String[] args){
        System.out.println(" Spring Tutorial 1: Hello World without Spring ");
        DummyService dummyService = new DummyServiceImpl();
        System.out.println(" DummyService returned: "+dummyService.test());
    }

}
