package org.lsh.dubhe.service.impl;

import org.lsh.dubhe.domain.User;
import org.lsh.dubhe.mapper.UserMapper;
import org.lsh.dubhe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;
    @Override
    public User getUserByAccount(String userAccount) {
        return userMapper.getUserByAccount(userAccount);
    }
}
