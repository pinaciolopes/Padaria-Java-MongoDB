package com.javapablophelipe.cadastro_usuario.business;

import com.javapablophelipe.cadastro_usuario.infrastructure.entitys.Padaria;
import com.javapablophelipe.cadastro_usuario.infrastructure.entitys.Usuario;
import com.javapablophelipe.cadastro_usuario.infrastructure.repository.PadariaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PadariaService {

    private final PadariaRepository repository;

    public PadariaService(PadariaRepository repository) {
        this.repository = repository;
    }

    public void cadastrarProduto(Padaria padaria) {
        repository.save(padaria);
    }

    public Padaria buscarProdutoPorId(String id) { return repository.findById(id).orElse(null);
    }

    public void deletarProdutoPorId(String id) {
        repository.deleteById(id);
    }

    public Padaria atualizarProdutoParcialporId(String id, Padaria padariaAtualizado) {
        Padaria padariaExistente = repository.findById(id).orElse(null);

        if(padariaExistente != null) {
            if (padariaAtualizado.getNome() != null) {
                padariaExistente.setNome(padariaAtualizado.getNome());
            }
            if (padariaAtualizado.getPreco() != null) {
                padariaExistente.setPreco(padariaAtualizado.getPreco());
            }
            return repository.save(padariaExistente);
        }else{
            return null;
        }
    }
    public List<Padaria> listarPadaria(String id){return repository.findAll();}
}
