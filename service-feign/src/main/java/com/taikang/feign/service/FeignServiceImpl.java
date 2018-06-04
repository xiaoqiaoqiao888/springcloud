package com.taikang.feign.service;

import org.springframework.stereotype.Service;

@Service
public class FeignServiceImpl implements FeignService {

    @Override
    public String helloFeign(String name) {

        return "sorry, " + name + " from feign error.";
    }

}
