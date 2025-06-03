package com.example.favoritos.infrastructure;

import com.example.favoritos.domain.LlaveFavorita;
import com.example.favoritos.domain.LlaveFavoritaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class LlaveFavoritaRepositoryImpl implements LlaveFavoritaRepository {

    private final LlaveFavoritaJpaRepository jpaRepository;

    @Override
    public LlaveFavorita guardar(LlaveFavorita llave) {
        return jpaRepository.save(llave);
    }

    @Override
    public List<LlaveFavorita> listar() {
        return jpaRepository.findAll();
    }

    @Override
    public Optional<LlaveFavorita> buscarPorValor(String valor) {
        return jpaRepository.findByValor(valor);
    }

    @Override
    public LlaveFavorita actualizarAlias(Long id, String nuevoAlias) {
        LlaveFavorita llave = jpaRepository.findById(id).orElseThrow();
        llave.setAlias(nuevoAlias);
        return jpaRepository.save(llave);
    }

    @Override
    public void eliminar(Long id) {
        jpaRepository.deleteById(id);
    }
}