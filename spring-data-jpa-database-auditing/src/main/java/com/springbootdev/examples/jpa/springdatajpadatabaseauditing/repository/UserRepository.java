package com.springbootdev.examples.jpa.springdatajpadatabaseauditing.repository;

import com.springbootdev.examples.jpa.springdatajpadatabaseauditing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}