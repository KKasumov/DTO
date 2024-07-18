package com.kasumov.DTO.responce;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.kasumov.DTO.IndividualDTO;
import com.kasumov.DTO.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IndividualDTOResponse {
    private UserDTO userDTO;
    private IndividualDTO individualDTO;
}
