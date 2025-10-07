package com.javapablophelipe.cadastro_usuario.infrastructure.entitys;
;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "usuarios")

public class Usuario {

    @Id
    private String id;

    @JsonProperty
    private String nome;

    @JsonProperty
    private String cpf;

    @JsonProperty
    private String email;

    @JsonProperty
    private LocalDate dataNascimento;

    @JsonProperty
    private String telefone;
}
