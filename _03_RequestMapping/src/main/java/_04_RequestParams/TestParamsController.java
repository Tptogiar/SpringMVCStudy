package _04_RequestParams;

import _04_RequestParams.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/8 - 11:52
 */
@Controller
@RequestMapping("/params")
public class TestParamsController {


    @GetMapping("/params")
    public String testParams(String name){
        System.out.println("name: "+name);
        return "index";
    }

    @GetMapping("/paramsMapping")
    public String testParamsMapping(@RequestParam("username")String name){
        System.out.println("username: "+name);
        return "index";
    }


    @GetMapping("/paramsMappingRequire")
    public String testParamsMappingRequire(
            @RequestParam(value = "username",required = false)String name
    ){
        System.out.println("username: "+name);
        return "index";
    }

    @GetMapping("/paramsMappingRequireDefaultValue")
    public String testParamsMappingRequireDefaultValue(
            @RequestParam(value = "username",required = false,defaultValue = "root")String name
    ){
        System.out.println("username: "+name);
        return "index";
    }


    @GetMapping("/requestHeader")
    public String testRequestHeader(
            @RequestParam(value = "username",required = false,defaultValue = "root")String name,
            @RequestHeader(value = "host")String host,
            HttpServletRequest req
    ){
        System.out.println("username: "+name);
        System.out.println("host:  "+host);
        String id = req.getSession().getId();
        System.out.println("id:  "+id);
        return "index";
    }


    @GetMapping("/cookieValue")
    public String testCookieValue(
            @RequestParam(value = "username",required = false,defaultValue = "root")String name,
            @RequestHeader(value = "host")String host,
            @CookieValue("JSESSIONID")String sessionId
    ){
        System.out.println("username: "+name);
        System.out.println("host:  "+host);
        System.out.println("JSESSION:  "+sessionId);
        return "index";
    }

    @GetMapping("/bean")
    public String testBean(
            @RequestParam(value = "username",required = false,defaultValue = "root")String name,
            @RequestHeader(value = "host")String host,
            @CookieValue("JSESSIONID")String sessionId,
            User user

    ){
        System.out.println("username: "+name);
        System.out.println("host:  "+host);
        System.out.println("JSESSION:  "+sessionId);
        System.out.println(user);
        return "index";
    }
}
