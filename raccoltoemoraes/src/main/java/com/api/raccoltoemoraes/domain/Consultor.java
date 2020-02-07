package com.api.raccoltoemoraes.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Consultor {
    @Id
    private Long id;
    private String primeiroNome;
    private String sobreNome;
    private String password;
    private String email;
    private Boolean ativo;
}
