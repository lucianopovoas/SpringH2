package com.ex.atividade3.repository;

import com.ex.atividade3.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
}
