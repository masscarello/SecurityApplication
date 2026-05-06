package com.Mascarello.ProjetoFoda.reposiories;

import com.Mascarello.ProjetoFoda.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel,Long> {
}
