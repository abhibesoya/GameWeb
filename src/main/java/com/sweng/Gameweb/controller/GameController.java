package com.sweng.Gameweb.controller;

/**
 * Created by Abhishek on 12-04-2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {
    @RequestMapping("/")
    public String games() {
        return "home";
    }

    @RequestMapping("/game")
    @ResponseBody
    public String listofgames() {
        return "home";
    }
}
