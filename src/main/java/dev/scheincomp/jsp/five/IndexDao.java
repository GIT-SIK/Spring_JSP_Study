package dev.scheincomp.jsp.five;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IndexDao {

    public IndexVO getIndex();
}
