package com.marcela.falcao.taskmanager.controllers.task;


import com.marcela.falcao.taskmanager.enums.Status;
import com.marcela.falcao.taskmanager.models.task.TaskResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("tasks")
public class TaskController {

    @GetMapping
    public ResponseEntity<List<TaskResponse>> findAll() {
        var dummyResponse = List.of(new TaskResponse(
                1L,
                "Task 1",
                "Create Task API",
                LocalDateTime.of(2024, Month.JULY, 7, 11, 52),
                Status.PENDING));
        return ResponseEntity.ok(dummyResponse);
    }
}
