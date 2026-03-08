package com.example.ElielProva.Services;

import com.example.ElielProva.Models.EstudanteModel;
import com.example.ElielProva.Repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel criarEstudante(EstudanteModel estudante){
        return estudanteRepository.save(estudante);
    }

    public List<EstudanteModel> findALL(){
        return estudanteRepository.findAll();
    }

    public void deletarEstudante(Long id){
        estudanteRepository.deleteById(id);
    }
}