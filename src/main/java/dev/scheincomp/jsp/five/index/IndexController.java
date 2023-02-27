package dev.scheincomp.jsp.five.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    IndexMapper indexMapper;

    @GetMapping("/")
    public void index() throws Exception{
        System.out.println("==TEST==");
        System.out.println(indexMapper.getData());
        System.out.println("--TEST--");
    }

}
