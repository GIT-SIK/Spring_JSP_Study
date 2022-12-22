package dev.scheincomp.jsp.study;

import dev.scheincomp.jsp.index.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path ="/study")
public class StudyController {
    @Autowired
    private IndexDao indexDao;
    @GetMapping("/1")
    public String Study1(){
        return "study/s1";
    }

    @GetMapping("/2")
    public String Study2(Model model){
        System.out.println(indexDao.getIndex());

        model.addAttribute("data", indexDao.getIndex());
        return "study/s2";
    }
}
