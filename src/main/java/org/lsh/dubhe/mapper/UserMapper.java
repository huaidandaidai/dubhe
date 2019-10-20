package org.lsh.dubhe.mapper;

import org.apache.ibatis.annotations.*;
import org.lsh.dubhe.domain.system.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "userMapper")
public interface UserMapper {
    @Select("select * from dubhe_user where user_id = #{userId}")
    User getUserById(@Param("userId") Long userId);

    @Select("select * from dubhe_user where user_account = #{userAccount}")
    User getUserByAccount(@Param("userAccount") String userAccount);

    @Select("select * from dubhe_user")
    List<User> listUsers();

    @Insert("insert into dubhe_user(userAccount,userPassword,userName,deleteFlag,createDateTime)values()")
    void insertUser(User user);

    @Update("update dubhe_user set user_account=#{userAccount}, user_password=#{userPassword},user_name=#{userName} where user_id=#{userId}")
    void updateUser(User user);

    @Update("update dubhe_user set delete_flag = 1 where user_id = #{userId}")
    void deleteUser(Long userId);
}
