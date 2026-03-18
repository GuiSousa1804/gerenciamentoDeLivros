package com.primeiro.livros.services;

import com.primeiro.livros.models.LivroModel;
import com.primeiro.livros.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public LivroModel criarLivro(LivroModel livroModel) {
        return livroRepository.save(livroModel);
    }

    public List<LivroModel>findAll(){
        return livroRepository.findAll();
    }

    public void deletarLivro(Long id){
        livroRepository.deleteById(id);
    }

    public LivroModel buscarPorId(Long id){
        return livroRepository.findById(id).orElse(null);
    }
}
