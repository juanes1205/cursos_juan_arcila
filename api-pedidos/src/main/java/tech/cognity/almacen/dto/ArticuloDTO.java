package tech.cognity.almacen.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ArticuloDTO {
    private Integer id;
    private String nombre;
    private Double precio;
}
