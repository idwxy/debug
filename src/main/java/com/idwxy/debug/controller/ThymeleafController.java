package com.idwxy.debug.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ThymeleafController {

    @GetMapping("/thymeleaf")
    public String hey(HttpServletRequest request, @RequestParam(value = "description", required = false, defaultValue =
    "springboot-thymeleaf") String description) {
        request.setAttribute("description", description);
        return "thymeleaf";
    }
}
