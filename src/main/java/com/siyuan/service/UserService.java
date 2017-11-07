package com.siyuan.service;

import com.siyuan.entity.User;
import org.springframework.stereotype.Service;
import com.siyuan.pojo.CommonResult;

/**
 * Created by ruthguo on 2017/11/7.
 * @author ruthguo
 */
@Service
public interface UserService {
    CommonResult  addUser(User user);
}
