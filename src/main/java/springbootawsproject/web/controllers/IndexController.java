package springbootawsproject.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xinghui on 4/27/17.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
