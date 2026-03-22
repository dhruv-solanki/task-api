package com.dhruv.task.mapper.impl;

import com.dhruv.task.domain.CreateTaskRequest;
import com.dhruv.task.domain.dto.CreateTaskRequestDto;
import com.dhruv.task.domain.dto.TaskDto;
import com.dhruv.task.domain.entity.Task;
import com.dhruv.task.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
            dto.title(),
            dto.description(),
            dto.dueDate(),
            dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
            task.getId(),
            task.getTitle(),
            task.getDescription(),
            task.getDueDate(),
            task.getStatus(),
            task.getPriority()
        );
    }
}
