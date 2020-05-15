package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.AuthorRepository;

@Controller
public class AuthorController {
	private AuthorRepository repository;
	
	public AuthorController(AuthorRepository authorRepository) {
		this.repository = authorRepository;
	}
	
	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		model.addAttribute("authors", repository.findAll());
		return "authors/list";
	}
}


//• Create Author Controller OK
//• Inject Author Repository via constructor into controller OK
//• Create method to handle request for authors at “/authors” OK
//• Add list of authors to model, and return view “authors/list” OK
//• Create Thymeleaf template to display list of authors 