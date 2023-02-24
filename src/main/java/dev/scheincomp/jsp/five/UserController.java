package dev.scheincomp.jsp.five;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/login")
    public String loginPage (){
        return "five/login";
    }

}
