package com.kasumov.DTO;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserHistoryDTO {

    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String profile_type;
    private String reason;
    private String comment;
    private String changed_values;
    private UUID profile_id;
}
