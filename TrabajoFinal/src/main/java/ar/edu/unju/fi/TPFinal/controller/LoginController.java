package ar.edu.unju.fi.TPFinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String getLoginPage()
	{
		return "login";
	}

	@GetMapping("/logout")
	public String getLogoutPage()
	{
		return "logout";
	}
}
