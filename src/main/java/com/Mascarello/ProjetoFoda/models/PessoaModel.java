package com.Mascarello.ProjetoFoda.models;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "TBL_PESSOAS")
public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;





}
