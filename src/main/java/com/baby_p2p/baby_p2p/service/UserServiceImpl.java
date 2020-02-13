package com.baby_p2p.baby_p2p.service;


import com.baby_p2p.baby_p2p.dao.UserMapper;
import com.baby_p2p.baby_p2p.entity.TUserAccount;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public TUserAccount login(String username) {
        return userMapper.login(username);
    }
}
