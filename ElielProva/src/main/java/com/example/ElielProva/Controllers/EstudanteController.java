package com.example.ElielProva.Controllers;

import com.example.ElielProva.Models.EstudanteModel;
import com.example.ElielProva.Services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @GetMapping
    public ResponseEntity<List<EstudanteModel>> findAll(){
        List<EstudanteModel> estudantes = estudanteService.findALL();
        return ResponseEntity.ok().body(estudantes);
    }

    @PostMapping
    public ResponseEntity<EstudanteModel> criarEstudante(@RequestBody EstudanteModel estudante){
        EstudanteModel novoEstudante = estudanteService.criarEstudante(estudante);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(novoEstudante.getId()).toUri();

        return ResponseEntity.created(uri).body(novoEstudante);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<EstudanteModel>> buscarPorId(@PathVariable Long id) {
        Optional<EstudanteModel> estudante = estudanteService.findId(id);
        return ResponseEntity.ok().body(estudante);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEstudante(@PathVariable Long id){
        estudanteService.deletarEstudante(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstudanteModel> atualizarEstudante(@PathVariable Long id, @RequestBody EstudanteModel estudante){
        EstudanteModel estudanteAtualizado = estudanteService.atualizar(id, estudante);
        return ResponseEntity.ok().body(estudanteAtualizado);
    }
}