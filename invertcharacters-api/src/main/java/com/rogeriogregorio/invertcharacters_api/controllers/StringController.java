package com.rogeriogregorio.invertcharacters_api.controllers;

import com.rogeriogregorio.invertcharacters_api.services.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invert-string")
public class StringController {

    private final StringService stringService;

    @Autowired
    public StringController(StringService stringService) {
        this.stringService = stringService;
    }

    @GetMapping
    public String invertString(@RequestParam String input) {

        return stringService.invert(input);
    }
}
