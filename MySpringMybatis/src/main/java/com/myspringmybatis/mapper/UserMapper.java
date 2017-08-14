package com.myspringmybatis.mapper;

import com.myspringmybatis.model.User;

import java.util.List;

public interface UserMapper {
    //根据id查询用户
    User selectUserById(long id);
    //根据姓名模糊查询用户
    List<User> selectUserByName(String name);
    //根据学号模糊查询用户
    List<User> selectUserBystudentNumber(int studentnumber);
    //插入一个用户,返回受影响的行数
    int insertUser(User user);
    //删除一个用户,返回受影响的行数
    boolean deleteUser(long id);
    //更新一个用户,返回受影响的行数
    boolean updateUser(User user);
}
