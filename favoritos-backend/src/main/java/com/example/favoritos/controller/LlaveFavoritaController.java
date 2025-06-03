package com.example.favoritos.controller;

import com.example.favoritos.domain.LlaveFavorita;
import com.example.favoritos.service.LlaveFavoritaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/llaves")
@RequiredArgsConstructor
public class LlaveFavoritaController {

    private final LlaveFavoritaService service;

    @PostMapping
    public ResponseEntity<LlaveFavorita> agregarLlave(@RequestBody LlaveFavorita llave) {
        return ResponseEntity.ok(service.agregar(llave));
    }

    @GetMapping
    public ResponseEntity<List<LlaveFavorita>> listarLlaves() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/validar/{valor}")
    public ResponseEntity<Boolean> validarLlave(@PathVariable String valor) {
        return ResponseEntity.ok(service.existeLlave(valor));
    }

    @PutMapping("/{id}/alias")
    public ResponseEntity<LlaveFavorita> editarAlias(@PathVariable Long id, @RequestBody String alias) {
        return ResponseEntity.ok(service.editarAlias(id, alias));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarLlave(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}