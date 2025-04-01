package com.todo.Todo.Application.repository;

import com.todo.Todo.Application.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
