package com.ex.atividade3.controller;

import com.ex.atividade3.model.Aluno;
import com.ex.atividade3.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/getAll")
    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }
}
