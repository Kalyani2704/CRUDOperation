package com.application.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.application.dto.TaskDTO;
import com.application.model.Tasks;
import com.application.service.TaskService;

@RestController
@RequestMapping("/api/")
public class TaskController {
	@Autowired
	private TaskService serv;
	
	@GetMapping("tasks")
	public List<Tasks> viewProduct() {
		return serv.viewTasks();
	}
	
	@PostMapping("tasks")
	public TaskDTO addTasks(@RequestBody TaskDTO task) {
		System.out.println(task.toString());
		boolean b = serv.addTasks(task);
		if (b)
			return task;
		else
			return null;
	}
	
	@DeleteMapping("tasks/{id}")
	public String deleteByProductId(@PathVariable("id") long id) {
		boolean b = serv.deleteTaskById(id);
		if (b)
			return id + "Task deleted.........";
		else
			return id + "Task not deleted..........";
	}
	
	@PutMapping("tasks/{id}")
	public String updateProduct(@PathVariable("id") long id, @RequestBody TaskDTO task) {
		System.out.println(task.toString());
		System.out.println(id);
		boolean b = serv.updateTaskById(task, id);
		if (b)
			return "Task updated....";
		else
			return "Task not updated....";
	}
}
