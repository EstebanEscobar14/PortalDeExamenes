package com.sistema_examenes.sistemaexamenesbakend.servicios;



import com.sistema_examenes.sistemaexamenesbakend.modelo.Examen;
import com.sistema_examenes.sistemaexamenesbakend.modelo.Pregunta;

import java.util.Set;

public interface PreguntaService {

    Pregunta agregarPregunta(Pregunta pregunta);

    Pregunta actualizarPregunta(Pregunta pregunta);

    Set<Pregunta> obtenerPreguntas();

    Pregunta obtenerPregunta(Long preguntaId);

    Set<Pregunta> obtenerPreguntasDelExamen(Examen examen);

    void eliminarPregunta(Long preguntaId);

    Pregunta listarPregunta(Long preguntaId);

}
