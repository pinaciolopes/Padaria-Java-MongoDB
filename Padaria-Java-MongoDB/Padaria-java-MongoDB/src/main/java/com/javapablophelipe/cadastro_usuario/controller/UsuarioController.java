package com.javapablophelipe.cadastro_usuario.controller;


import com.javapablophelipe.cadastro_usuario.business.UsuarioService;
import com.javapablophelipe.cadastro_usuario.infrastructure.entitys.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "https://padaria-java.onrender.com/usuario")

public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {this.service = service;}

    @PostMapping
    public ResponseEntity <Void>criar(@RequestBody Usuario usuario){service.salvarUsuario(usuario); return ResponseEntity.ok().build();}

    @GetMapping
    public ResponseEntity <List<Usuario>> listar(){List<Usuario> usuarios = service.listarUsuario(); return ResponseEntity.ok(usuarios);}

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable String id){Usuario usuario = service.buscarPorId(id); return ResponseEntity.ok(usuario);}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable String id){service.deletarUsuario(id); return ResponseEntity.ok().build();}

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizar(@PathVariable String id, @RequestBody Usuario usuario) {
        Usuario atualizado = service.atualizarUsuarioporId(id, usuario);
        return ResponseEntity.ok(atualizado);
    }


}

