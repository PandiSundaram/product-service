package com.pandi.mysqldb.Endpoint;

import com.pandi.mysqldb.Dao.UserDao;
import com.pandi.mysqldb.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Restcontroller {


    @Autowired
    UserDao userDao;


    @PostMapping
    public ResponseEntity adduser(@RequestBody User user){

        userDao.save(user);

        return ResponseEntity.status(201).build();

    }




}
