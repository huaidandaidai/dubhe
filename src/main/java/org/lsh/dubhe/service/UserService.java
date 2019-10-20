package org.lsh.dubhe.service;

import org.lsh.dubhe.domain.system.User;

public interface UserService {
    User getUserByAccount(String userAccount);
}
