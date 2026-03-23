package com.dhruv.task.controller;

import com.dhruv.task.domain.CreateTaskRequest;
import com.dhruv.task.domain.dto.CreateTaskRequestDto;
import com.dhruv.task.domain.dto.TaskDto;
import com.dhruv.task.domain.entity.Task;
import com.dhruv.task.mapper.TaskMapper;
import com.dhruv.task.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/api/tasks")
public class TaskController {
    private final TaskService taskService;
    private final TaskMapper taskMapper;

    public TaskController(TaskService taskService, TaskMapper taskMapper) {
        this.taskService = taskService;
        this.taskMapper = taskMapper;
    }

    @PostMapping
    public ResponseEntity<TaskDto> createTask(
        @Valid @RequestBody CreateTaskRequestDto createTaskRequestDto
    ) {
        CreateTaskRequest createTaskRequest = taskMapper.fromDto(createTaskRequestDto);
        Task task = taskService.createTask(createTaskRequest);
        TaskDto createdTaskDto = taskMapper.toDto(task);
        return new ResponseEntity<>(createdTaskDto, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TaskDto>> listTasks() {
        List<Task> tasks = taskService.listTasks();
        List<TaskDto> taskDtos = tasks.stream().map(taskMapper::toDto).toList();
        return new ResponseEntity<>(taskDtos, HttpStatus.OK);
    }
}
