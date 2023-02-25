package dev.scheincomp.jsp.five.board;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path ="/board")
public class BoardController {

    @Autowired
    BoardMapper boardMapper;

    // 게시판 리스트 //
    @GetMapping("/")
    public String boardList(Model model) throws Exception{

        List<BoardVO> list = boardMapper.getBoardList();
        model.addAttribute("list", list);

        return "five/board/board";
    }

    // 게시판 조회 //
    @GetMapping("/{b_no}")
    public void boardView(@PathVariable("b_no") int bno) {

    }
}
