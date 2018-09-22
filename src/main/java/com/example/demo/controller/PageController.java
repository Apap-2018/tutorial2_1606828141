package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	@RequestMapping("/viral")
	public String index() {
		return "viral2jari";
	}
	
	@RequestMapping("/challenge")
	public String challenge(@RequestParam(value = "name") String name, Model model) {
		model.addAttribute("name",name);
		return "challenge";
	}
	
	@RequestMapping("/challenge/{name}")
	public String challengePath(@PathVariable String name, Model model) {
		model.addAttribute("name",name);
		return "challenge";
	}
	
	@RequestMapping("/generator")
	 public String generator(@RequestParam(value = "a", defaultValue = "0") String a, @RequestParam(value = "b", defaultValue = "0") String b, Model model) {
	  model.addAttribute("a", a);
	  model.addAttribute("b", b);
	  int varA = Integer.parseInt(a);
	  int varB = Integer.parseInt(b);
	  String hm = "h";
	  String output = "";
	  
	  if (varA == 0) varA = 1;
	  if (varB == 0) varB = 1;
	  
	  for (int i = 0; i < varA; i++) {
	   hm += "m";
	  }
	  
	  for (int i = 0; i < varB; i++) {
	   output += (hm + " ");
	  }
	  
	  System.out.println(output);
	  model.addAttribute("text", output);
	  return "generator";
	 }
}
