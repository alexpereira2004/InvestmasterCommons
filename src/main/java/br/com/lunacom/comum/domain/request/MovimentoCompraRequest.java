package br.com.lunacom.comum.domain.request;

import br.com.lunacom.comum.validation.DataBrasil;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Component
public class MovimentoCompraRequest extends GenericRequest {
    private String id;

    @NotBlank(message = "Data do Aquisição não pode estar vazia (dataAquisicao)")
    @DataBrasil
    private String dataAquisicao;
    private String dataAquisicaoInicio;
    private String dataAquisicaoFinal;
    @NotBlank(message = "Informe o Preço Pago (precoPago)")
    private String precoPago;
    @NotBlank(message = "Informe a quantidade (quantidade)")
    private String quantidade;
    private String totalInvestido;
    private String indicacao;
    private String estrategia;
    private String ativoCodigo;
}








