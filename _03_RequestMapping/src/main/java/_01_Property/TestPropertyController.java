package _01_Property;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/7 - 22:16
 */
@Controller
@RequestMapping("/value")
public class TestPropertyController {

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


    @RequestMapping(value = "/testParams",params = {"username=root"})
    public String testParams(){
        return "index";
    }

    @GetMapping(value = "/testHreader",headers = {"Host=localhost:8080"})
    public String testHreader(){
        return "index";
    }








}
