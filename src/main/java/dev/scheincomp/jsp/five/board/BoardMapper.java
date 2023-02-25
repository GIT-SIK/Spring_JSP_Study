package dev.scheincomp.jsp.five.board;


import java.util.List;

public interface BoardMapper {

    public List<BoardVO> getBoardList() throws Exception;
    public BoardVO getBoard(int bNo) throws Exception;
}
