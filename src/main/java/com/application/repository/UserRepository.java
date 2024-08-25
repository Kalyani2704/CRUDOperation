package com.application.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.application.model.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}
