package com.sistema_examenes.sistemaexamenesbakend;


import com.sistema_examenes.sistemaexamenesbakend.modelo.Rol;
import com.sistema_examenes.sistemaexamenesbakend.modelo.Usuario;
import com.sistema_examenes.sistemaexamenesbakend.modelo.UsuarioRol;
import com.sistema_examenes.sistemaexamenesbakend.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaExamenesBakendApplication implements CommandLineRunner {
	@Autowired
	private UsuarioService usuarioService;


	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBakendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			/*Usuario usuario = new Usuario();

			usuario.setNombre("Esteban");
			usuario.setApellido("Escobar");
			usuario.setUsername("Esteban14");
			usuario.setPassword("12345");
			usuario.setEmail("e1@gmail.com");
			usuario.setTelefono("12345678");
			usuario.setPerfil("foto.png");

			Rol rol = new Rol();
			rol.setRolId(1L);
			rol.setRolNombre("ADMIN");


			Set<UsuarioRol> usuarioRoles = new HashSet<>();
			UsuarioRol usuarioRol = new UsuarioRol();
			usuarioRol.setRol(rol);
			usuarioRol.setUsuario(usuario);
			usuarioRoles.add(usuarioRol);

			Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
			System.out.println(usuarioGuardado.getUsername());*/
	}
}
