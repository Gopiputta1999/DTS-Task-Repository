package com.DTS_Developer_Challenge.DTS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DTS_Developer_Challenge.DTS.Model.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task,Integer> {
	

}
