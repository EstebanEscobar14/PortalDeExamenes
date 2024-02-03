package com.sistema_examenes.sistemaexamenesbakend.repositorios;


import com.sistema_examenes.sistemaexamenesbakend.modelo.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

}
