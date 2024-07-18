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

public class AddressDTO {

    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String address;
    private String zipCode;
    private String city;
    private String state;

    private CountryDTO countryDTO;
}
