package _02_AntStyle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/8 - 10:45
 */
@Controller
@RequestMapping("/ant")
public class TestAntController {


    @GetMapping("/question/a?a")
    public String question(){
        return "index";
    }

    @GetMapping("/asterisk/a*a")
    public String asterisk(){
        return "index";
    }

    @GetMapping("/**/doubleAsterisk")
    public String doubleAsterisk(){
        return "index";
    }

}
