package tech.cognity.almacen.converter;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractConverter <E,D> {
    // Convertir una entidad a un DTO
    public abstract D fromEntity(E entity);

    // Convertir un DTO a una entidad
    public abstract E fromDTO(D dto);

    // Lista de entidades a DTO
    public List<D> fromEntity(List<E> entitys){
        return entitys.stream()
                .map(e -> fromEntity(e))
                .collect(Collectors.toList());
    }

    // Lista de DTO a entidades
    public List<E> fromDTO(List<D> dtos){
        return dtos.stream()
                .map(e -> fromDTO(e))
                .collect(Collectors.toList());
    }


}
