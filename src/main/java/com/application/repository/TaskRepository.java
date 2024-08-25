package com.application.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.application.model.Tasks;

public interface TaskRepository extends JpaRepository<Tasks, Long>{

}
