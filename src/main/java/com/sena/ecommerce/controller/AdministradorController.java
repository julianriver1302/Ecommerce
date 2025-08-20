package com.sena.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//decirle a la perra esa clase que es de tipo controlador
@Controller
@RequestMapping("/administrador") // solicitud de mapeoal directorio administrador
public class AdministradorController {

	@GetMapping("")
	public String home() {
		return "administrador/home";
	}

}
