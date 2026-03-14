package com.primeiro.livros.repositories;

import com.primeiro.livros.models.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroModel, Long> {}
