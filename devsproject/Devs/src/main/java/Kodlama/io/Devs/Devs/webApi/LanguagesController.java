package Kodlama.io.Devs.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.Devs.business.abstracts.LanguagesService;
import Kodlama.io.Devs.Devs.entitites.concretes.ProgrammingLanguages;

//Erişim noktası

@RestController // annotation
@RequestMapping("api/Languages")
//erişimi sağlayan kod

public class LanguagesController {

	private LanguagesService languagesService;

     	public LanguagesController(LanguagesService languagesService) {
		this.languagesService = languagesService;
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguages> getAll(){
		return languagesService.getAll();
	}
}
