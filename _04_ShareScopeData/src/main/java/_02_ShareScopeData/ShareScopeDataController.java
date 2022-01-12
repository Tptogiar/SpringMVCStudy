package _02_ShareScopeData;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/10 - 11:18
 */
@Controller
public class ShareScopeDataController {


    @GetMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest req){
        req.setAttribute("testRequestScope","testServletAPI");
        return "index";
    }

    @GetMapping("/testMap")
    public String testMap(Map<String,Object> map){
        map.put("testRequestScope","testMap");
        return "index";
    }

    @GetMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap){
        modelMap.put("testRequestScope","testModelMap");
        return "index";
    }

    @GetMapping("/testModel")
    public String testModel(Model model){
        model.addAttribute("testRequestScope","testModel");
        return "index";
    }


    @GetMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("testRequestScope","testModelAndView");
        System.out.println(modelAndView.getClass().getName());
        modelAndView.setViewName("index");
        return modelAndView;
    }


    @GetMapping("/testSession")
    public String testModel(HttpSession session){
        session.setAttribute("testSessionScope","testSession");
        return "index";
    }

    @GetMapping("/testApplication")
    public String testApplication(HttpSession session, HttpServletRequest req){
        ServletContext servletContext = req.getServletContext();
        ServletContext servletContext1 = session.getServletContext();

        System.out.println(servletContext.hashCode()+"  "+servletContext1.hashCode());
        System.out.println(servletContext == servletContext1);
        servletContext.setAttribute("testApplicationScope","testApplication");
        return "index";
    }

}
