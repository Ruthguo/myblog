package com.siyuan.contrllor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ruthguo on 2017/11/7.
 * @author ruthguo
 */
@RestController
public class IndexController {
    @RequestMapping(value="/")
    public String index(){
        return "欢迎访问首页!";
    }
}
