package com.taikang.feign.service;

import org.springframework.stereotype.Service;

@Service
public class Fallback implements FeignService {

    @Override
    public String hello(String name) {

        return "sorry, " + name + " from feign error.";
    }

}
