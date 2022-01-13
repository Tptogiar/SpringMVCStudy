package _01_HttpMessageConverter;

import _01_HttpMessageConverter.pojo.po.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/13 - 19:17
 */
@Controller
public class TestController {

    @PostMapping("/testRequestBody")
    @ResponseBody
    public String testRequestBody(@RequestBody String reqBody){
        return reqBody;
    }


    @GetMapping("/testRequestEntity")
    @ResponseBody
    public String testRequestEntity( RequestEntity<String> reqEntity){
        String[] strings = new String[10];
        strings[0]=reqEntity.getHeaders().toString();
        strings[1]=reqEntity.getBody();
        strings[2]=reqEntity.getUrl().toString();
        strings[3]=reqEntity.getMethod().toString();
        if (reqEntity.getType()!=null){
            strings[4]=reqEntity.getType().toString();
        }
        return Arrays.toString(strings);
    }



    @GetMapping("/testRequestEntitys")
    @ResponseBody
    public Object[] testRequestEntitys( RequestEntity<String> reqEntity){
        Object[] objects = new Object[10];
        objects[0]=reqEntity.getHeaders().toString();
        objects[1]=reqEntity.getBody();
        objects[2]=reqEntity.getUrl().toString();
        objects[3]=reqEntity.getMethod().toString();
        if (reqEntity.getType()!=null){
            objects[4]=reqEntity.getType().toString();
        }
        objects[5]=new User(1,"sdf");
        return objects;
    }



}
