package com.example.favoritos.service;

import com.example.favoritos.domain.LlaveFavorita;
import com.example.favoritos.domain.LlaveFavoritaRepository;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class LlaveFavoritaServiceTest {

    LlaveFavoritaRepository repo = mock(LlaveFavoritaRepository.class);
    LlaveFavoritaService service = new LlaveFavoritaService(repo);

    @Test
    void testAgregarLlave() {
        LlaveFavorita mockLlave = new LlaveFavorita(1L, "correo", "ejemplo@correo.com", "Mi Amigo");

        when(repo.guardar(any())).thenReturn(mockLlave);

        LlaveFavorita result = service.agregar(mockLlave);

        assertEquals("correo", result.getTipo());
        verify(repo, times(1)).guardar(mockLlave);
    }

    // Otros tests omitidos para brevedad
}