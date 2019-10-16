package com.gpw.controller;

import com.gpw.Repository.userRepository;
import com.gpw.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: Gpw
 * @Date: 2019/5/23
 * @Description: com.gpw.controller
 * @Version: 1.0
 */
@RestController
public class userController {

    @Autowired
    userRepository userRepository;

    @GetMapping("/user/{id}")
    public user getUser(@PathVariable("id") Integer id){
        user user = this.userRepository.getOne(id);
        return user;
    }

    @GetMapping("/user")
    public user insertUser(user user){
        user save = this.userRepository.save(user);
        return save;
    }
}
