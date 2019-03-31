package com.example.demo5.Controller;

import com.example.demo5.Entity.User;
import com.example.demo5.Service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api("user相关的api")
public class UserController {

    protected static Logger logger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @GetMapping
    @ApiOperation(value = "根据所有用户信息")
    public User UserInfo(){
        return userService.user();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id查询用户信息")
    public User getUserById(@PathVariable int id) {
        logger.info("根据ID查询用户");
        return userService.getUserById(id);
    }

    @PostMapping()
    @ApiOperation(value = "通过json插入用户")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @PutMapping
    @ApiOperation(value = "通过ID更新用户密码")
    public void updatePasswordById(int id,String password){
        userService.updatePasswordById(id,password);
    }

    @DeleteMapping
    @ApiOperation(value = "根据ID删除用户")
    public void deleteUserById(int ID){
        userService.deleteUserById(ID);
    }

}
