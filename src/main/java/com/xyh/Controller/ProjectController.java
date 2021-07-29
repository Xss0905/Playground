package com.xyh.Controller;

import com.xyh.domain.Playitems;
import com.xyh.domain.User;
import com.xyh.service.Projectservice;
import com.xyh.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private Projectservice projectservice;
    @Autowired
    private Userservice userservice;
    /*
     * @Author Xss
     * @Description  拿取项目的基本信息
     * @Date 10:13 2021/7/28
     * @Param
     * @return
     **/
    @RequestMapping("getproject")
    public String getproject(Model model){
        List<Playitems> getproject = projectservice.getproject();
        model.addAttribute("projectlist",getproject);
        return "index2";
    }

    @RequestMapping("admin")
    public String test(){
        return "redirect:/getproject";
    }


    /*
     * @Author Xss
     * @Description  查看项目详情
     * @Date 15:48 2021/7/28
     * @Param
     * @return
     **/
    @RequestMapping("seldetails")
    public String selbyid(int id,Model model){
        Playitems selbyid = projectservice.selbyid(id);
        model.addAttribute("project",selbyid);
        return "promessage";
    }


    /*
     * @Author Xss
     * @Description  根据坐标获取地图
     * @Date 16:26 2021/7/28
     * @Param
     * @return
     **/
    @RequestMapping("getmapbycoord")
    public String map(){
        return "mymap";
    }

    /*
     * @Author Xss
     * @Description  登录验证
     * @Date 17:37 2021/7/28
     * @Param
     * @return
     **/
    @RequestMapping("log")
    public String loginn(User user, Model model, HttpSession session){
        List<User> selbynameandpwd = userservice.selbynameandpwd(user);
        if(selbynameandpwd.size()!=0){
            String name = selbynameandpwd.get(0).getName();
            session.setAttribute("uname",name);
            return "redirect:/getproject";
        }else {
            model.addAttribute("msg","账号或密码错误");
            return "login";
        }
    }
}
