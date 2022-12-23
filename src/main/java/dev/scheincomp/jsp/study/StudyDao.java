package dev.scheincomp.jsp.study;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudyDao {

    public StudyVO getData();
    public List<StudyVO> getListData();

    public int insertData(StudyVO studyVO);
}
