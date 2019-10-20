package org.lsh.dubhe.service;

import org.lsh.dubhe.dao.system.User;

public interface UserService {
    User getUserByAccount(String userAccount);
}
