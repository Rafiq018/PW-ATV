package br.com.etechoracio.Atividade.repository;

import br.com.etechoracio.Atividade.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    //                                         informa qual entidade vai ser alterada e tipo de dado da chave primaria
    List<Disciplina> findBynome(String nome);
}
