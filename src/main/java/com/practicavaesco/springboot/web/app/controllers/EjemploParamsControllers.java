package com.practicavaesco.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsControllers {
	
	
	//Ejemplo de petición: http://localhost:8200/params/string?texto=%22Hola%20C%C3%A9sar%22
	@GetMapping("/string")
	public String param(@RequestParam(name ="texto") String texto, Model model) {
		model.addAttribute("resultado", "El texto enviado es: " + texto);
		return "params/ver";
	}
}
