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

public class UserDTO {

    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String secret_key;
    private String first_name;
    private String last_name;
    private String changed_values;
    private LocalDateTime verified_at;
    private LocalDateTime archived_at;
    private String status;
    private Boolean filled;
    private UUID address_id;
    private String email;

}
