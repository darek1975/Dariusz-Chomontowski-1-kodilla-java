package com.kodilla.hibernat.tasklist.dao;

import com.kodilla.hibernat.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface TaskListDao extends CrudRepository<TaskList, Integer> {
 List<TaskList> findByListName (String listName);
}
