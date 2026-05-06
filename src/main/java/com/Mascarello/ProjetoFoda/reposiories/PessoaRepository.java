package com.Mascarello.ProjetoFoda.reposiories;

import com.Mascarello.ProjetoFoda.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaModel,Long> {
}
