package es.upsa.ssi.trabajo1.domain.dtos;

import lombok.*;

@Data
@Builder(setterPrefix = "with")
@NoArgsConstructor
@AllArgsConstructor
@With
public class JugadorDto {
    private String nombre;
    private String nacionalidad;
    private String foto;
    private String valorMercado;
}
