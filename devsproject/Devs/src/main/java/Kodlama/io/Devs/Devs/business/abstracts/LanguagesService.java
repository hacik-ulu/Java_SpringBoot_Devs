package Kodlama.io.Devs.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.Devs.entitites.concretes.ProgrammingLanguages;

// Kuralları tanımlayacağımız yapıyı tasarlıyoruz.

public interface LanguagesService {

	List<ProgrammingLanguages>getAll();
	
}
