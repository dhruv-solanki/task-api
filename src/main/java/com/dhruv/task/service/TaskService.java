package com.dhruv.task.service;

import com.dhruv.task.domain.CreateTaskRequest;
import com.dhruv.task.domain.entity.Task;

public interface TaskService {
    Task createTask(CreateTaskRequest request);
}
