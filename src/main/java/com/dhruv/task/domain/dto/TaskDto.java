package com.dhruv.task.domain.dto;

import com.dhruv.task.domain.entity.TaskPriority;
import com.dhruv.task.domain.entity.TaskStatus;

import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
    UUID id,
    String title,
    String description,
    LocalDate dueDate,
    TaskStatus status,
    TaskPriority priority
) {
}
