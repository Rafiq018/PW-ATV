package br.com.etechoracio.Atividade.repository;

import br.com.etechoracio.Atividade.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitorRepository extends JpaRepository<Monitor, Long>{
}
