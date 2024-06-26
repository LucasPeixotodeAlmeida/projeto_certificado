package com.projetonlw.projeto_certificado.modules.questions.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlternativesResultDTO {
    private UUID id;
    private String description;
}
