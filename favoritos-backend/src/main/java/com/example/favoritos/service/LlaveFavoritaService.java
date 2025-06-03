package com.example.favoritos.service;

import com.example.favoritos.domain.LlaveFavorita;
import com.example.favoritos.domain.LlaveFavoritaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LlaveFavoritaService {
    private final LlaveFavoritaRepository repository;

    public LlaveFavorita agregar(LlaveFavorita llave) {
        return repository.guardar(llave);
    }

    public List<LlaveFavorita> listar() {
        return repository.listar();
    }

    public boolean existeLlave(String valor) {
        return repository.buscarPorValor(valor).isPresent();
    }

    public LlaveFavorita editarAlias(Long id, String alias) {
        return repository.actualizarAlias(id, alias);
    }

    public void eliminar(Long id) {
        repository.eliminar(id);
    }
}