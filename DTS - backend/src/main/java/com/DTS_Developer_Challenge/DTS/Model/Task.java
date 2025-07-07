package com.DTS_Developer_Challenge.DTS.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tasks")
public class Task {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@NotBlank(message = "Title is required")
private String title;

private String description;

@Enumerated(EnumType.STRING)
private TaskStatus status;

@NotNull(message = "Due date/time is required")
private LocalDateTime dueDateTime;

public Task() {
	
}

public Task(int id, String title, String description,TaskStatus status,LocalDateTime dueDateTime) {
	this.id=id;
	this.title=title;
	this.description=description;
	this.status=status;
	this.dueDateTime=dueDateTime;
	
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public TaskStatus getStatus() {
	return status;
}

public void setStatus(TaskStatus status) {
	this.status = status;
}

public LocalDateTime getDueDateTime() {
	return dueDateTime;
}

public void setDueDateTime(LocalDateTime dueDateTime) {
	this.dueDateTime = dueDateTime;
}



}
