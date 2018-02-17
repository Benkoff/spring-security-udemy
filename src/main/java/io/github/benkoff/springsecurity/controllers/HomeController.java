package io.github.benkoff.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Ben Novikov on February 2018
 *
 * implements functionality of original LoginController from the course
 */
@Controller
public class HomeController {
    @GetMapping({"", "/", "/index", "/home"})
    public String home() {
        return "/home";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/access_denied")
    public String accessdenied() {
        return "/error/access_denied";
    }

}
