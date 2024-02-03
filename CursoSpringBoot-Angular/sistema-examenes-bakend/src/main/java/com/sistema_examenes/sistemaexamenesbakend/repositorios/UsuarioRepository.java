package com.sistema_examenes.sistemaexamenesbakend.repositorios;

import com.sistema_examenes.sistemaexamenesbakend.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public  Usuario findByUsername(String username);
}
