package com.jms.boilerplate.controller;

import com.jms.boilerplate.service.HelloWorldService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/helloworld/no-auth")
    @ResponseBody
    public String getHelloWorld() {
        return helloWorldService.getHelloWorld();
    }

    @GetMapping("/helloworld/restricted-auth")
    @ResponseBody
    @PreAuthorize("hasAuthority('SCOPE_Api.ExampleScope1')")
    public String getHelloWorldRestrictedAuthority() {
        return helloWorldService.getHelloWorldRestrictedAuthority();
    }

    @GetMapping("/helloworld/restricted-any-auth")
    @ResponseBody
    @PreAuthorize("hasAnyAuthority('SCOPE_Api.ExampleScope2','SCOPE_Api.ExampleScope3')")
    public String getHelloWorldRestrictedAnyAuthority() {
        return helloWorldService.getHelloWorldRestrictedAnyAuthority();
    }

}