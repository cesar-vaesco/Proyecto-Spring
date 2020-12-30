package com.practicavaesco.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsControllers {
	
	
	@GetMapping("/")
	public String index() {
		return "params/index";
	}
	
	//Ejemplo de petición: http://localhost:8200/params/string?texto=%22Hola%20C%C3%A9sar%22
	//Se puede declarar que el parametro no sea requerido(required= false) o que tenga un valor por defecto  defaultValue = "Algún valor..."
	@GetMapping("/string")
	public String param(@RequestParam(name ="texto", defaultValue = "Soy la flor que marchito el olvido") String texto, Model model) {
		model.addAttribute("resultado", "El texto enviado es: " + texto);
		return "params/ver";
	}
}
