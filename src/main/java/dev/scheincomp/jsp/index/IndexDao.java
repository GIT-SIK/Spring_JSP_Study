package dev.scheincomp.jsp.index;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IndexDao {

    public IndexVO getIndex();
    public List<IndexVO> getListIndex();
}
