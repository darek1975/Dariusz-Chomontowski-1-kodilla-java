package com.kodilla.hibernat.task.dao;


import com.kodilla.hibernat.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {
List<Task> findByDuration(int duration);
}
