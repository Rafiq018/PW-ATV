package br.com.etechoracio.Atividade.service;

import br.com.etechoracio.Atividade.entity.Disciplina;
import br.com.etechoracio.Atividade.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository repository;

    public List<Disciplina> listar(){
        return repository.findAll();
    }

    public Disciplina cadastrar(Disciplina disciplina) {
        var existe = repository.findBynome(disciplina.getNome());
        if(!existe.isEmpty()){
            throw new RuntimeException("Nome da disciplina já cadastrado");
        }
        return repository.save(disciplina);
    }
}
