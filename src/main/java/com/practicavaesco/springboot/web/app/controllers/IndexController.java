/**
 * 
 */
package com.practicavaesco.springboot.web.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author thece
 *
 */
@Controller
public class IndexController {
	
	@GetMapping({"/index","/home","/"})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Mundo con Spring!");
		model.addAttribute("parrafo", "Pasando datos con la interfaz Model");
		return "index";
	}
	
	@GetMapping("/modelmap")
	public String index2(ModelMap model) {
		model.addAttribute("titulo", "Pasando datos con la clase model map");
		return "modelMap";
	}
	
	@GetMapping("/map")
	public String index3(Map<String, Object> map) {
		map.put("titulo", "Pasando datos con la clase map");
		return "map";
	}
	
	@GetMapping("/view")
	public ModelAndView  index4(ModelAndView mv) {
		mv.addObject("titulo", "Pasando datos con la clase ModelAndView");
		mv.setViewName("view");
		return mv;
	}

}
