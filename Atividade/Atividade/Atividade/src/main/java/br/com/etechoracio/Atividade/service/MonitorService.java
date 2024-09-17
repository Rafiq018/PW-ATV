//Luis Henrique Barreira & Rafiq Petelinkar Aboarrage

package br.com.etechoracio.Atividade.service;

import br.com.etechoracio.Atividade.entity.Monitor;
import br.com.etechoracio.Atividade.repository.MonitorRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Service
public class MonitorService {
    @Autowired
    private MonitorRepository repository;
    public List<Monitor> listar() {return repository.findAll();}
    public Monitor cadastraMonitor(Monitor monitor){return repository.save(monitor);}
}
