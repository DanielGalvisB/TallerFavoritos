package com.example.favoritos.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "llaves_favoritas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LlaveFavorita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String valor;
    private String alias;
}