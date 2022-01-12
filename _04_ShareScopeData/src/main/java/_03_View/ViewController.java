package _03_View;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/12 - 11:44
 */
@Controller
@RequestMapping("/view")
public class ViewController {

    @GetMapping("/testInternalResourceView")
    public String testInternalResourceView(){
        return "forward:/index";
    }

    @GetMapping("/testRedirectView")
    public String testRedirectView(){
        return "redirect:/";
    }

}
