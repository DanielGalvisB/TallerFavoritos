package com.example.favoritos.infrastructure;

import com.example.favoritos.domain.LlaveFavorita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LlaveFavoritaJpaRepository extends JpaRepository<LlaveFavorita, Long> {
    Optional<LlaveFavorita> findByValor(String valor);
}