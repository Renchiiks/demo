package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    public ModelAndView home(Alien alien, HttpSession session) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("alien", alien);
        modelAndView.setViewName("home/home");
        System.out.println("Hi " + alien.getName());

        return modelAndView;
    }
}
