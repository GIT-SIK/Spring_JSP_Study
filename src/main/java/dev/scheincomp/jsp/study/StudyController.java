package dev.scheincomp.jsp.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path ="/study")
public class StudyController {
    @GetMapping("/1")
    public String Study1(){
        return "study/s1";
    }
}
