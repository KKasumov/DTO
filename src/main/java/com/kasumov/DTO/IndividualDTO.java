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

public class IndividualDTO {

    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String passport_number;
    private String phone_number;
    private String email;
    private String status;
    private UUID user_id;
    private String first_name;
    private String last_name;

}

