package com.application.service;
import java.util.List;
import com.application.dto.TaskDTO;
import com.application.model.Tasks;

public interface TaskService {
	boolean addTasks(TaskDTO task);

	List<Tasks> viewTasks();

	boolean deleteTaskById(long id);

	boolean updateTaskById(TaskDTO task, long id);

}
