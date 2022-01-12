package _01_TestEnvironment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/9 - 22:26
 */
@Controller
public class TestController {


    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/index")
    public String testIndex(){
        return "index";
    }


}
