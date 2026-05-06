package com.Mascarello.ProjetoFoda.controllers;

import com.Mascarello.ProjetoFoda.models.PessoaModel;
import com.Mascarello.ProjetoFoda.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaModel> findAll(){
       return pessoaService.findAll();
    }
    @PostMapping
    public PessoaModel criarPessoa(@RequestBody PessoaModel pessoaModel){
        return pessoaService.criarPessoa(pessoaModel);
    }

}
