/**
 * 
 */
package com.practicavaesco.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practicavaesco.springboot.web.app.models.Usuario;

/**
 * @author thece
 *
 */
@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index","/home","/",""})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Mundo con Spring!");
		model.addAttribute("parrafo", "Pasando datos con la interfaz Model");
		return "index";
	}
	
	
	@GetMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("César");
		usuario.setApellido("Vargas");
		usuario.setEmail("thecesarvargas@gmail.com");
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		model.addAttribute("usuario", usuario);

		return "perfil";
	}
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Usuario> usuarios = new ArrayList<>();
		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("usuarios", usuarios);
		return "listar";
	}

}
