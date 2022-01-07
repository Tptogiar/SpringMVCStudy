package _01_ValueProperty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.xml.ws.RequestWrapper;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/7 - 22:16
 */
@Controller
@RequestMapping("/value")
public class TestValueController {

    @RequestMapping("/index")
    public String testDuplicateValue1(){
        return "index";
    }


//    @RequestMapping("/index")
//    public String testDuplicateValue2(){
//        return "index";
//    }

    @RequestMapping(value = {"index1","index2"})
    public String testValues(){
        return "index";
    }

}
