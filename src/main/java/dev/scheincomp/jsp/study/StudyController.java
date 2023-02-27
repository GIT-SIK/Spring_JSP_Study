package dev.scheincomp.jsp.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping(path ="/study")
public class StudyController {

    @Autowired
    private StudyMapper studyMapper;
    @GetMapping("/1")
    public String Study1() {
        return "study/s1";
    }

    @GetMapping("/2")
    public String Study2(Model model){
        System.out.println(studyMapper.getData());
        model.addAttribute("data", studyMapper.getData());
        return "study/s2";
    }

    @GetMapping("/3")
    public String Study3(Model model){
        System.out.println(studyMapper.getListData());
        model.addAttribute("dataList", studyMapper.getListData());
        return "study/s3";
    }

    @GetMapping("/4")
    public String Study4(Model model){
        return "study/s4";
    }

    /* 일반 타입으로 받기 */
    @PostMapping ("/insert/p")
    public String insert1(
            @RequestParam("hide_1") String hide_1,
            @RequestParam("hide_2") String hide_2,
            @RequestParam("hide_3") String hide_3,
            @RequestParam("hide_4") String hide_4,
            @RequestParam("data_1") String data_1  ){
            System.out.println(hide_1 + " / " + hide_2  + " / " + hide_3 + " / " + hide_4  + " / " + data_1);
        return "study/s4";
    }

    /* JSON 타입 -> Map으로 받기 */
    /* insert */
    /* Object -> bool & String */
    @PostMapping ("/insert/j")
    public String insert1(  @RequestBody HashMap<String, Object> map  ){
        System.out.println(map.get("hide_1") + " / " + map.get("hide_2")  + " / " + map.get("hide_3") + " / " + map.get("hide_4")  + " / " + map.get("data_1"));
        StudyVO studyVO = new StudyVO();
        studyVO.setHide_1((boolean)map.get("hide_1"));
        studyVO.setHide_2((boolean)map.get("hide_2"));
        studyVO.setHide_3((boolean)map.get("hide_3"));
        studyVO.setData_1((String)map.get("data_1"));

        studyMapper.insertData(studyVO);

        return "study/s4";
    }


}
