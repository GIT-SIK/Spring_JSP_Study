package dev.scheincomp.jsp.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController
{
    @Autowired
    private IndexDao indexDao;

    @GetMapping("/")
    public String index(){
        System.out.println(indexDao.getIndex());
        return "view/index";
    }
}