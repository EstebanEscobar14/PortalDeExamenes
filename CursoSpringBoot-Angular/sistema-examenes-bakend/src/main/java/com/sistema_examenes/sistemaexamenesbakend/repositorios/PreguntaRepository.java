package com.sistema_examenes.sistemaexamenesbakend.repositorios;


import com.sistema_examenes.sistemaexamenesbakend.modelo.Examen;
import com.sistema_examenes.sistemaexamenesbakend.modelo.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface PreguntaRepository extends JpaRepository<Pregunta,Long> {

    Set<Pregunta> findByExamen(Examen examen);

}
