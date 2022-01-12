package _01_InternalResourceView;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/12 - 12:26
 */


@Controller
@RequestMapping({"/","/index"})
public class IndexController {

    @GetMapping("/testInternalResourceView")
    public String testInternalResourceView(){
        return "testInternalResourceView";
    }


}
