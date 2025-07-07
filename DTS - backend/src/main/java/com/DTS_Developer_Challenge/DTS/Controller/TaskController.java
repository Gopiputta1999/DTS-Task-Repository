package com.DTS_Developer_Challenge.DTS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.DTS_Developer_Challenge.DTS.Model.Task;
import com.DTS_Developer_Challenge.DTS.Model.TaskStatus;
import com.DTS_Developer_Challenge.DTS.Repository.TaskRepo;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	@Autowired
	private TaskRepo taskRepo;
	@GetMapping("/{id}")
	public ResponseEntity<Task> getTaskById(@PathVariable int id){
		Task task=taskRepo.findById(id)
				                        .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "There was no task with id : " + id));
		return ResponseEntity.ok(task);
		
	}
	@GetMapping
    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }
	@PostMapping
	public ResponseEntity<Task> createTask(@RequestBody Task task) {
	    Task savedTask = taskRepo.save(task);
	    return new ResponseEntity<>(savedTask, HttpStatus.CREATED);
	}

	@PatchMapping("/{id}/status")
    public ResponseEntity<Task> updateTaskStatus(@PathVariable int id, @RequestParam TaskStatus status) {
        Task task = taskRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found with id: " + id));
        task.setStatus(status);
        Task updatedTask = taskRepo.save(task);
        return ResponseEntity.ok(updatedTask);
    }
	@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable int id) {
        Task task = taskRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found with id: " + id));
        taskRepo.delete(task);
        return ResponseEntity.noContent().build();
    }
}
