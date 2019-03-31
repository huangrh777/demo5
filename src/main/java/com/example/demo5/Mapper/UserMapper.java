package com.example.demo5.Mapper;


import com.example.demo5.Entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
       User user();
       User getUserById(int id);
       void addUser(User user);
       void updatePasswordById(@Param("ID") int id, @Param("password")String password);
       void deleteUserById(int ID);
}
