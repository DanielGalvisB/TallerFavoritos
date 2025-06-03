package com.example.favoritos.domain;

import java.util.List;
import java.util.Optional;

public interface LlaveFavoritaRepository {
    LlaveFavorita guardar(LlaveFavorita llave);
    List<LlaveFavorita> listar();
    Optional<LlaveFavorita> buscarPorValor(String valor);
    LlaveFavorita actualizarAlias(Long id, String nuevoAlias);
    void eliminar(Long id);
}