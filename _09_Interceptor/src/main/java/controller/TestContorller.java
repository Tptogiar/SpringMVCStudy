package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/13 - 22:19
 */
@Controller
public class TestContorller {


    @GetMapping("/testInterceptor")
    public String testInterceptor(){
        return "index";
    }

    





}
