package com.xyh.service;

import com.xyh.domain.User;
import com.xyh.domain.UserExample;
import com.xyh.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice {
    @Autowired
    private UserMapper userMapper;


    /*
     * @Author Xss
     * @Description  登录判断
     * @Date 17:33 2021/7/28
     * @Param
     * @return
     **/
    public List<User> selbynameandpwd(User user){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNameEqualTo(user.getName()).andPwdEqualTo(user.getPwd());
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }
}
