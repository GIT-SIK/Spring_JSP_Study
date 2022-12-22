package dev.scheincomp.jsp.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path ="/study")
public class StudyController {
    @Autowired
    private StudyDao studyDao;
    @GetMapping("/1")
    public String Study1(){
        return "study/s1";
    }

    @GetMapping("/2")
    public String Study2(Model model){
        System.out.println(studyDao.getData());
        model.addAttribute("data", studyDao.getData());
        return "study/s2";
    }

    @GetMapping("/3")
    public String Study3(Model model){
        System.out.println(studyDao.getListData());
        model.addAttribute("dataList", studyDao.getListData());
        return "study/s3";
    }
}
