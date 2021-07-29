package com.xyh.mapper;

import com.xyh.domain.Playitems;
import com.xyh.domain.PlayitemsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlayitemsMapper {
    int countByExample(PlayitemsExample example);

    int deleteByExample(PlayitemsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Playitems record);

    int insertSelective(Playitems record);

    List<Playitems> selectByExample(PlayitemsExample example);

    Playitems selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Playitems record, @Param("example") PlayitemsExample example);

    int updateByExample(@Param("record") Playitems record, @Param("example") PlayitemsExample example);

    int updateByPrimaryKeySelective(Playitems record);

    int updateByPrimaryKey(Playitems record);
}