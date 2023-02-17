package dev.scheincomp.jsp.all;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AllController {
    @GetMapping("/loginPage")
    public String loginPage (){
        return "all/login";
    }

}
