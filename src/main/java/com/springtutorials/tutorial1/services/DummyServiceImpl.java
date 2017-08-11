package com.springtutorials.tutorial1.services;

import org.springframework.stereotype.Service;

/**
 * @author amit@springtutorials.com
 *
 * A dummy service implementation that returns "OK"
 */
@Service
public class DummyServiceImpl implements DummyService {

    @Override
    public String test() {
        return "OK";
    }
}
