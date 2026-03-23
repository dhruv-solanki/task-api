package com.dhruv.task.service.impl;

import com.dhruv.task.domain.CreateTaskRequest;
import com.dhruv.task.domain.UpdateTaskRequest;
import com.dhruv.task.domain.entity.Task;
import com.dhruv.task.domain.entity.TaskStatus;
import com.dhruv.task.exception.TaskNotFoundException;
import com.dhruv.task.repository.TaskRepository;
import com.dhruv.task.service.TaskService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> listTasks() {
        return taskRepository.findAll(Sort.by(Sort.Direction.ASC, "createdAt"));
    }

    @Override
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

    @Override
    public Task updateTask(UUID taskId, UpdateTaskRequest request) {
        Task task = taskRepository.findById(taskId).orElseThrow(
                () -> new TaskNotFoundException(taskId)
        );

        task.setTitle(request.title());
        task.setDescription(request.description());
        task.setDueDate(request.dueDate());
        task.setStatus(request.status());
        task.setPriority(request.priority());
        task.setUpdatedAt(Instant.now());

        return taskRepository.save(task);
    }
}
