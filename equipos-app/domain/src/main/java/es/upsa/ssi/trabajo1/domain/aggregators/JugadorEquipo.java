package es.upsa.ssi.trabajo1.domain.aggregators;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
@With
public class JugadorEquipo
{
    private String nombre;
    private String valor_mercado;
    private String fin_contrato;
}
