package com.project.loginpage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.loginpage.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
