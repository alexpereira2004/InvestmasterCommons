package br.com.lunacom.comum.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class GoogleSpreadsheetCotacaoDto {
    private String codigo;
    private String cotacao;
}
