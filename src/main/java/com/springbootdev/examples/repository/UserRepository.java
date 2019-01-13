package com.springbootdev.examples.repository;

import com.springbootdev.examples.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{

}
