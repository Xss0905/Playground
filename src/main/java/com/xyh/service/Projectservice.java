package com.xyh.service;

import com.xyh.domain.Playitems;
import com.xyh.mapper.PlayitemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Projectservice {

    @Autowired
    private PlayitemsMapper playitemsMapper;


    /*
     * @Author Xss
     * @Description 获取项目的全部信息
     * @Date 11:05 2021/7/28
     * @Param
     * @return
     **/
    public List<Playitems> getproject(){
        return playitemsMapper.selectByExample(null);
    }


    /*
     * @Author Xss
     * @Description  查看每个项目的详情
     * @Date 15:47 2021/7/28
     * @Param
     * @return
     **/
    public Playitems selbyid(int id){
        return playitemsMapper.selectByPrimaryKey(id);
    }
}
