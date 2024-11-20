package com.yy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yy.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
