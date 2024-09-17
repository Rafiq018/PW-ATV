package br.com.etechoracio.Atividade.controller;

import br.com.etechoracio.Atividade.entity.Disciplina;
import br.com.etechoracio.Atividade.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
    @Autowired
    private DisciplinaService service;

    @GetMapping
    public List<Disciplina> listar(){
        return service.listar();
    }

    public Disciplina cadastrar(@RequestBody Disciplina disciplina) {
        return service.cadastrar(disciplina);
    }
}

