package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/14 - 19:53
 */
@Controller
public class TestController {


    @GetMapping("/exception")
    public String exception(){
        int a = 8/0;
        return "error";
    }


}
