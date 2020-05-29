package com.goshala.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.goshala.dto.User;

public interface UserRepository extends CrudRepository<User, Long>{

}