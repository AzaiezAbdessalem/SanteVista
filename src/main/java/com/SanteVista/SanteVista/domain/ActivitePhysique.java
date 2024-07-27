package com.SanteVista.SanteVista.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActivitePhysique implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 2, max = 50)
    @Pattern(regexp = "^[a-zA-ZÀ-ÿ'\\s-]+$")
    @Column(name = "name", nullable = false,  length = 50)
    private String name;
    @Column(name = "duree", nullable = false)
    private Integer duree;
}
