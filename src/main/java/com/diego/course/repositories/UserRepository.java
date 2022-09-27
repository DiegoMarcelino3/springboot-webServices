package com.diego.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
