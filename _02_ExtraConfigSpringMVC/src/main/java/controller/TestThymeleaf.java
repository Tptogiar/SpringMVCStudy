package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/7 - 12:19
 */
@Controller
public class TestThymeleaf {


    @RequestMapping("/")
    public String indexHtml(){
        return "index";
    }

    @RequestMapping("/target")
    public String targetHtml(){
        return "target";
    }



}
