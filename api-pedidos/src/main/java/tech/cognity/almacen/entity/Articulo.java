package tech.cognity.almacen.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="articulos")

public class Articulo {
    @Id  // llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // campo autogenerado,incremental
    private Integer id;

    @Column(unique = true, nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false)
    private Double precio;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(nullable = false)
    private Boolean activo;
}
