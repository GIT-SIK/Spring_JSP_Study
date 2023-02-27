package dev.scheincomp.jsp.study;



import java.util.List;

public interface StudyMapper {

    public StudyVO getData();
    public List<StudyVO> getListData();

    public int insertData(StudyVO studyVO);
}
