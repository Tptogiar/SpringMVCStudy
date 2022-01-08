package _03_placeholder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/8 - 10:53
 */
@Controller
//@RequestMapping("/placeholder")
public class TestPlaceholderController {


    @GetMapping("/placeholder/{username}/{password}")
    public String placeholder(@PathVariable("username") String username,@PathVariable("password")String password){
        System.out.println("username: " +username+", password: "+password);
        return "index";
    }





}
