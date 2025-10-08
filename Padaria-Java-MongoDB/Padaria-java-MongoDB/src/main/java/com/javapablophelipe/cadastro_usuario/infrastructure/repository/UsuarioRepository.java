package com.javapablophelipe.cadastro_usuario.infrastructure.repository;



import com.javapablophelipe.cadastro_usuario.infrastructure.entitys.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;


public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    Optional<Usuario> findById(String id);

}
