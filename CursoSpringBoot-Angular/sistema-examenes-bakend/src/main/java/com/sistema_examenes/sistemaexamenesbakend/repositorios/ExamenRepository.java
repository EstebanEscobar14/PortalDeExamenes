package com.sistema_examenes.sistemaexamenesbakend.repositorios;


import com.sistema_examenes.sistemaexamenesbakend.modelo.Categoria;
import com.sistema_examenes.sistemaexamenesbakend.modelo.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamenRepository extends JpaRepository<Examen,Long> {

    List<Examen> findByCategoria(Categoria categoria);

    List<Examen> findByActivo(Boolean estado);

    List<Examen> findByCategoriaAndActivo(Categoria categoria,Boolean estado);
}
