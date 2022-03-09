package com.duranco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
@GetMapping("")
public ModelAndView getPage()
{
ModelAndView mv=new ModelAndView("index.html");	
return mv;
}
@PostMapping("envoie") //action du form
@ResponseBody // pour récupérer les valeurs venant du body
public String getName(@RequestParam(name = "nom") String name,@RequestParam String prenom,int age)
{
return "Bienvenu "+name+" "+prenom+" "+age;	

}
@GetMapping("affichage")
public String affiche(@RequestParam(required = false) String nom)
{
	return "vous êtes: "+nom;
	
}
@GetMapping("value")
public String affichevalue(@RequestParam(defaultValue = "admin") String grade)
{
return "bienvenu "+grade;	
}

}
