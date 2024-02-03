package com.sistema_examenes.sistemaexamenesbakend.servicios;

import com.sistema_examenes.sistemaexamenesbakend.modelo.Usuario;
import com.sistema_examenes.sistemaexamenesbakend.modelo.UsuarioRol;

import java.util.Set;

public interface UsuarioService {
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
