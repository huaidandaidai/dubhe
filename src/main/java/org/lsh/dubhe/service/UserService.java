package org.lsh.dubhe.service;

import org.lsh.dubhe.domain.User;

public interface UserService {
    User getUserByAccount(String userAccount);
}
