package com.core.controller;

import com.core.entity.User;
import com.core.exception.UserException;
import com.core.service.UserService;
import com.core.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by yonghuo.chen on 17/6/1.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

   /* @RequestMapping(value = "/page")
    public String list(@RequestParam(value = "pageNo",required = false,defaultValue = "1") String pageNoStr,
                       Map<String,Object> map){
        int pageNo=1;
        //对pageNo进行检验
        pageNo=Integer.parseInt(pageNoStr);
        if(pageNo<1){
            pageNo=1;
        }
        Page<User> page=userService.getPage(pageNo,5);
        map.put("page",page);
        return"list";
    }*/

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String getAllUsers(Model model){
        List<User> users=userService.findAll();
        for(int i=0;i<users.size();i++){
            User user=users.get(i);
            System.out.println("controller 用户名: "+user.getUsername()+"  手机号码: "+user.getMobile());
        }
        model.addAttribute("users",users);
        return "user";
    }

    @RequestMapping("/list")
    public String index(Model model) {
       // System.out.println("controller 用户名:   手机号码: test" );
        List<User> userList=userService.findAll();
        model.addAttribute("userList",userList);
        return "userListManager";
    }

    @RequestMapping("/input")
    public String editUser(User user,HttpServletRequest request) {
        return "edit";
    }

    @RequestMapping("/add")
    public String addUser(User user,HttpServletRequest request) {
        userService.addUser(user);
        return "redirect:/user/list";
    }

    @RequestMapping("/delete")
    public String deleteUser(int id, HttpServletResponse response) {
        try {
            userService.deleteUser(id);
            System.out.println("已经删除---"+id);
        } catch (UserException e) {
            e.printStackTrace();
        }
        return "redirect:/user/list";
    }

    @RequestMapping("{id}/edit")
    public String editUser(@PathVariable int id,HttpServletRequest model) {
        User user=userService.getUser(id);
        model.setAttribute("user",user);
        return "update";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String updateUser(User user) {
        try {
            System.out.println("controller 获取前台的user.id"+user.getId());
            System.out.println("user.username"+user.getUsername());
            User userUpdate=new User();
            userService.updateUser(user);
        } catch (UserException e) {
            e.printStackTrace();
        }
        return "redirect:/user/list";
    }

    @RequestMapping(value = "user",method = RequestMethod.GET)
    public String Create(Model model, int id) {
        //  System.out.println("controller 用户名:   手机号码: test /user" );
        if(String.valueOf(id)!=null){
            id=84;
        }
        User user=userService.getUser( id);
        model.addAttribute("user",user );
        return "user";
    }

    @RequestMapping("/getOne")
    public String getUser() {
        // System.out.println("controller 用户名:   手机号码: test" );
        return "query";
    }

    @RequestMapping("/getAll")
    public String getAllUsers( HttpServletRequest request) {
        // System.out.println("controller 用户名:   手机号码: test" );
        List<User> userList=userService.findAll();
        request.setAttribute("userList",userList);
        return "userListManager";
    }
}
