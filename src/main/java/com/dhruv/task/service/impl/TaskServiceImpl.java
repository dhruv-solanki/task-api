package com.dhruv.task.service.impl;

import com.dhruv.task.domain.CreateTaskRequest;
import com.dhruv.task.domain.entity.Task;
import com.dhruv.task.domain.entity.TaskStatus;
import com.dhruv.task.repository.TaskRepository;
import com.dhruv.task.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();

        Task task = new Task(
            null,
            request.title(),
            request.description(),
            request.dueDate(),
            TaskStatus.OPEN,
            request.priority(),
            now,
            now
        );

        return taskRepository.save(task);
    }
}
