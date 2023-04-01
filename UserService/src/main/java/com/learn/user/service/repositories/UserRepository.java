package com.learn.user.service.repositories;

import com.learn.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,String> {

    //Custom method and query write here
}
