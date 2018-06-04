package com.taikang.feign.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taikang.feign.service.FeignService;

@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @RequestMapping("/hi")
    public String ribbonController(@RequestParam String name) {
        return feignService.helloFeign(name);
    }
}
