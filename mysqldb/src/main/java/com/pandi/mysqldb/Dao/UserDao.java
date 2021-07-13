package com.pandi.mysqldb.Dao;

import com.pandi.mysqldb.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User,Integer> {



}
