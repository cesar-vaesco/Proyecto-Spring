/**
 * 
 */
package com.practicavaesco.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practicavaesco.springboot.web.app.models.Usuario;

/**
 * @author thece
 *
 */
@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;
	
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;

	@GetMapping({ "/index", "/home", "/", "" })
	public String index(Model model) {
		model.addAttribute("titulo", textoIndex);
		model.addAttribute("parrafo", "Pasando datos con la interfaz Model");
		return "index";
	}

	@GetMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("César");
		usuario.setApellido("Vargas");
		usuario.setEmail("thecesarvargas@gmail.com");
		model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
		model.addAttribute("usuario", usuario);

		return "perfil";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", textoListar);
		return "listar";
	}
	
	
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(new Usuario("Raúl", "Galarraga", "raul@correo.com"),
				new Usuario("Martha", "de la Cruz", "martha@correo.com"),
				new Usuario("Laura", "Diaz", "laura@correo.com"), 
				new Usuario("Mateo", "Sanchéz", "mateo@correo.com"),
				new Usuario("Luisa", "Perez", "luisa@correo.com"));
		return usuarios;
	}

}
