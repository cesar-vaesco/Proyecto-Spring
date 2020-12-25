/**
 * 
 */
package com.practicavaesco.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	

}
