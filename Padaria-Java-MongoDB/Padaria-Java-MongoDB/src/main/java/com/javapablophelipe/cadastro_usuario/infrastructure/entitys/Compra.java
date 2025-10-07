package com.javapablophelipe.cadastro_usuario.infrastructure.entitys;

import lombok.*;
import org.springframework.boot.context.properties.bind.Name;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "compra")

public class Compra {

    @Id
    private String id;

    @DBRef
    private Usuario usuario;

    @DBRef
    private List<Padaria> produtos;


    private LocalDateTime dataCompra;


    private Double valorTotal;


}
