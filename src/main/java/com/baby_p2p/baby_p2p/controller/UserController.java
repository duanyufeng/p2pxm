package com.baby_p2p.baby_p2p.controller;

import com.baby_p2p.baby_p2p.service.UserServiceImpl;
import com.baby_p2p.baby_p2p.entity.TUserAccount;
import com.baby_p2p.baby_p2p.tools.MD5Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserServiceImpl userService;

    private MD5Utils md5Utils;

    @PostMapping("/login")
    @ResponseBody
    public Object login(@RequestParam("username")String username, @RequestParam("password")String password){
        Map map = new HashMap<String,Object>();
        System.out.println(username);
        TUserAccount tUserAccount = userService.login(username);
        String passwordmd5 = md5Utils.toMD5(password);
        System.out.println(passwordmd5);
        if (tUserAccount==null){
            map.put("code","400");
            map.put("msg","用户不存在");
        }else if (!username.equals(tUserAccount.getUsername())){
            map.put("code","400");
            map.put("msg","用户名错误");
        }else if (!passwordmd5.equals(tUserAccount.getPassword())){
            map.put("code","400");
            map.put("msg","密码错误");
        }else {
            map.put("code","200");
            map.put("data",tUserAccount);
        }
        return map;
    }

    @PostMapping("register")
    @ResponseBody
    public Object register(@RequestParam("username")String username, @RequestParam("password")String password){
        return null;
    }
}
