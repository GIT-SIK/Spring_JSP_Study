package dev.scheincomp.jsp.five;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController
{
    @Autowired
    private IndexDao indexDao;

    @GetMapping("/")
    public String index(Model model){
        System.out.println(indexDao.getIndex());

        model.addAttribute("data", indexDao.getIndex());
        return "view/index";
    }
}
