package com.tony.clientdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Autowired
    MySpringCloudDemoService mySpringCloudDemoService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return mySpringCloudDemoService.hiService( name );
    }


}
