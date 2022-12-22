package dev.scheincomp.jsp.index;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IndexDao {

    public IndexVO getIndex();
}
