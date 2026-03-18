package com.primeiro.livros.controller;

import com.primeiro.livros.models.LivroModel;
import com.primeiro.livros.repositories.LivroRepository;
import com.primeiro.livros.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public ResponseEntity <LivroModel> criarLivro(@RequestBody LivroModel livroModel){
        LivroModel requeste = livroService.criarLivro(livroModel);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(requeste.getId())
                .toUri();
        return ResponseEntity.created(uri).body(requeste);
    }

    @GetMapping
    public ResponseEntity<List<LivroModel>> findAll(){
        List<LivroModel> requeste = livroService.findAll();
        return ResponseEntity.ok().body(requeste);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <?> deletarLivro(@PathVariable Long id){
        livroService.deletarLivro(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LivroModel> buscarPorID(@PathVariable Long id){
        LivroModel livroModel = livroService.buscarPorId(id);
        return ResponseEntity.ok(livroModel);
    }
}
