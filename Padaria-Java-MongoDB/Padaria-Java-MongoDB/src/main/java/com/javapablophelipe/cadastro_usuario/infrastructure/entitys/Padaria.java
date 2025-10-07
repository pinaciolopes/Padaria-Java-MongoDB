package com.javapablophelipe.cadastro_usuario.infrastructure.entitys;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Document(collection = "padaria")

public class Padaria {

    @Id
    private String id;


    private String nome;


    private Double preco;

}
