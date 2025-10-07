package com.javapablophelipe.cadastro_usuario.infrastructure.repository;

import com.javapablophelipe.cadastro_usuario.infrastructure.entitys.Padaria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface PadariaRepository extends MongoRepository<Padaria, String> {
    Optional<Padaria> findById(String id);
    @Transactional
    void deleteById(String id);

}
