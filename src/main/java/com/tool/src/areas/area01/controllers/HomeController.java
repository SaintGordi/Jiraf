package com.tool.src.areas.area01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Think on 10/17/2017.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage(Model model){

        return "base-layout";
    }
}
