package io.muic.webapp.project.spring.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody

    public String home(){
        return "home";

    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin() {
        return "I'm admin page";
    }
}
