package com.dhruv.task.service;

import com.dhruv.task.domain.CreateTaskRequest;
import com.dhruv.task.domain.UpdateTaskRequest;
import com.dhruv.task.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);
}
