package com.javapablophelipe.cadastro_usuario.controller;

import com.javapablophelipe.cadastro_usuario.business.PadariaService;
import com.javapablophelipe.cadastro_usuario.infrastructure.entitys.Padaria;
import com.javapablophelipe.cadastro_usuario.infrastructure.entitys.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/padaria")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:63342")

public class PadariaController {

    private final PadariaService padariaService;

    @PostMapping
    public ResponseEntity <Void> cadastrarProduto (@RequestBody Padaria padaria) {
        padariaService.cadastrarProduto(padaria);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity <List<Padaria>> listarPadaria(){List<Padaria> padarias = padariaService.listarPadaria(); return ResponseEntity.ok(padarias);}

    @GetMapping("/{id}")
    public ResponseEntity<Padaria> buscarProdutoPorId(@PathVariable String id){Padaria padaria = padariaService.buscarProdutoPorId(id); return ResponseEntity.ok(padaria);}
    @DeleteMapping
    public ResponseEntity<Void> deletarProdutoPorId (@RequestParam String id) {
        padariaService.deletarProdutoPorId(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizarPadaria (@RequestParam String id, @RequestBody Padaria padaria) {
        padariaService.atualizarProdutoParcialporId(id, padaria);
        return ResponseEntity.ok().build();
    }
}
