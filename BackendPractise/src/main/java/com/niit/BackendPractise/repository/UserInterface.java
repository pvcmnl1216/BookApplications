package com.niit.BackendPractise.repository;

import com.niit.BackendPractise.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInterface extends CrudRepository<User,String> {

}
