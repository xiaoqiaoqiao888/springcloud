package com.taikang.ribbon.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taikang.ribbon.service.RibbonService;

@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @RequestMapping("/hi")
    public String ribbonController(@RequestParam String name) {
        return ribbonService.helloRibbon(name);
    }
}
