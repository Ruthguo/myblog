package com.siyuan.service;

import com.siyuan.entity.User;
import com.siyuan.enums.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.siyuan.pojo.CommonResult;
import com.siyuan.repository.UserRepository;


/**
 * Created by ruthguo on 2017/11/7.
 * @author ruthguo
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public CommonResult addUser(User user) {

        if(null != userRepository.save(user)) {
            return new CommonResult(ResultEnum.OK.getCode(), "操作成功", null);
        }

        return new CommonResult(ResultEnum.FAIL.getCode(), "操作失败", null);

    }
}
