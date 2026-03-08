package com.example.ElielProva.Controllers;

import com.example.ElielProva.Models.EstudanteModel;
import com.example.ElielProva.Services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public EstudanteModel criarEstudante(@RequestBody EstudanteModel estudante){
        return estudanteService.criarEstudante(estudante);
    }

    @GetMapping
    public List<EstudanteModel> buscarEstudantes(){
        return estudanteService.findALL();
    }

    @GetMapping("/{id}")
    public Optional<EstudanteModel> buscarPorId(@PathVariable Long id){
        return estudanteService.findId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id){
        estudanteService.deletarEstudante(id);
    }
}