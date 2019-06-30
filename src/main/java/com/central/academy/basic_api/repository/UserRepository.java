package com.central.academy.basic_api.repository;

import com.central.academy.basic_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
