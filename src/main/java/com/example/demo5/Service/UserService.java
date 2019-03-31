package com.example.demo5.Service;

import com.example.demo5.Entity.User;
import com.example.demo5.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User user(){
        return userMapper.user();
    }

    public User getUserById(int id)
    {
        return userMapper.getUserById(id);
    }

    public void addUser(User user){
        userMapper.addUser(user);
    }

    public void updatePasswordById(int id,String password){
        userMapper.updatePasswordById(id,password);
    };

    public void deleteUserById(int ID){
        userMapper.deleteUserById(ID);
    }
}
