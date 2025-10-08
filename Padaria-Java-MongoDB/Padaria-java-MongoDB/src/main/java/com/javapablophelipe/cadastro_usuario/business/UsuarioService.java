package com.javapablophelipe.cadastro_usuario.business;


import com.javapablophelipe.cadastro_usuario.infrastructure.entitys.Usuario;
import com.javapablophelipe.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario salvarUsuario(Usuario usuario) { return repository.save(usuario); }

    public void deletarUsuario(String id) {repository.deleteById(id); }

    public Usuario atualizarUsuarioporId(String id, Usuario usuarioAtualizado) {
        Usuario usuarioExistente = repository.findById(id).orElse(null);

        if(usuarioExistente != null) {
            if (usuarioAtualizado.getNome() != null) {
                usuarioExistente.setNome(usuarioAtualizado.getNome());
            }
            if (usuarioAtualizado.getCpf() != null) {
                usuarioExistente.setCpf(usuarioAtualizado.getCpf());
            }
            if (usuarioAtualizado.getEmail() != null) {
                usuarioExistente.setEmail(usuarioAtualizado.getEmail());
            }
            if (usuarioAtualizado.getDataNascimento() != null) {
                usuarioExistente.setDataNascimento(usuarioAtualizado.getDataNascimento());
            }
            if (usuarioAtualizado.getTelefone() != null) {
                usuarioExistente.setTelefone(usuarioAtualizado.getTelefone());
            }
            return repository.save(usuarioExistente);
        }else{
            return null;
        }
    }
    public List<Usuario> listarUsuario(){return repository.findAll();}

    public Usuario buscarPorId(String id){return repository.findById(id).orElse(null);}

}
