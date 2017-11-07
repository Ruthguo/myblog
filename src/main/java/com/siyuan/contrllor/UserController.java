package com.siyuan.contrllor;

import com.siyuan.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.siyuan.pojo.CommonResult;
import com.siyuan.service.UserService;

import java.io.IOException;

/**
 * Created by ruthguo on 2017/11/7.
 * @author ruthguo
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public CommonResult addUser(@RequestParam(value = "name") String name) throws IOException{

        User user = new User();
        user.setName(name);

        return userService.addUser(user);



    }
}
