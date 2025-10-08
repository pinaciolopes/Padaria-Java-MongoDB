package com.javapablophelipe.cadastro_usuario.infrastructure.repository;

import com.javapablophelipe.cadastro_usuario.infrastructure.entitys.Compra;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompraRepository  extends MongoRepository<Compra, String> {
}
