package com.Mascarello.ProjetoFoda.services;

import com.Mascarello.ProjetoFoda.models.PessoaModel;
import com.Mascarello.ProjetoFoda.reposiories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaModel> findAll(){
        return pessoaRepository.findAll();
    }

    public PessoaModel criarPessoa(PessoaModel pessoaModel){

        return pessoaRepository.save(pessoaModel);
    }

}
