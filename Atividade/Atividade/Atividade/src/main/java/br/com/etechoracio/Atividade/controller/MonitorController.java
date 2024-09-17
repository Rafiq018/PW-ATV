//Luis Henrique Barreira & Rafiq Petelinkar Aboarrage

package br.com.etechoracio.Atividade.controller;

import br.com.etechoracio.Atividade.entity.Monitor;
import br.com.etechoracio.Atividade.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monitor")
public class MonitorController {

    @Autowired
    private MonitorService service;
    @GetMapping
    public List<Monitor> listar(){
        return service.listar();
    }
    @PostMapping
    public Monitor cadastrar(@RequestBody Monitor monitor){
        return service.cadastraMonitor(monitor);
    }
}
