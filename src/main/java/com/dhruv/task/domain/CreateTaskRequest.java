package com.dhruv.task.domain;

import com.dhruv.task.domain.entity.TaskPriority;

import java.time.LocalDate;

public record CreateTaskRequest(
    String title,
    String description,
    LocalDate dueDate,
    TaskPriority priority
) {
}
