package com.application.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.dto.TaskDTO;
import com.application.model.*;
import com.application.repository.*;

@Service
public class TaskServiceImpl implements TaskService{
	@Autowired
	private TaskRepository taskRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public boolean addTasks(TaskDTO task) {
		try {
			Users user =  userRepo.findById(task.getUser_id()).get();	
			Tasks t = new Tasks(task.getTitle(), task.getDescription(), task.getPriority(), task.getStatus(), task.getDue_date(), task.getCreated_at(), task.getUpdated_at(), user);
			taskRepo.save(t);
			return true;
		} 
		catch (Exception ex) {
			System.out.println("Repository Exception is " + ex);
			return false;
		}
	}

	@Override
	public List<Tasks> viewTasks() {
		return taskRepo.findAll();
	}

	@Override
	public boolean deleteTaskById(long id) {
		try {
			taskRepo.deleteById(id);
			return true;
		} 
		catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean updateTaskById(TaskDTO task, long id) {
		try {
			Tasks t = taskRepo.findById(id).get();
			t.setTitle(task.getTitle());
			t.setDescription(task.getDescription());
			t.setPriority(task.getPriority());
			t.setStatus(task.getStatus());
			t.setCreated_at(task.getCreated_at());
			t.setDue_date(task.getDue_date());
			t.setUpdated_at(task.getUpdated_at());
			taskRepo.save(t);
			return true;
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

}
