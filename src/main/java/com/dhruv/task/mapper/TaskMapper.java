package com.dhruv.task.mapper;

import com.dhruv.task.domain.CreateTaskRequest;
import com.dhruv.task.domain.UpdateTaskRequest;
import com.dhruv.task.domain.dto.CreateTaskRequestDto;
import com.dhruv.task.domain.dto.TaskDto;
import com.dhruv.task.domain.dto.UpdateTaskRequestDto;
import com.dhruv.task.domain.entity.Task;

public interface TaskMapper {
    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);

    TaskDto toDto(Task task);
}
