package com.example.demogateway.filters;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inCaseOfFailureUseThis")
public class FallbackController {

    @RequestMapping("")
    public String fallback(){
        return "error";
    }


}
