package com.marcela.falcao.taskmanager.models.task;

import com.marcela.falcao.taskmanager.enums.Status;

import java.time.LocalDateTime;

public record TaskResponse(
        Long id,
        String title,
        String description,
        LocalDateTime creationDate,
        Status status
) {
}
