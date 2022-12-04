package Kodlama.io.Devs.Devs.business.concretes;

import java.util.List;
import java.util.Locale.LanguageRange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.Devs.business.abstracts.LanguagesService;
import Kodlama.io.Devs.Devs.dataAcces.abstracts.LanguagesRepository;
import Kodlama.io.Devs.Devs.entitites.concretes.ProgrammingLanguages;

@Service // otomatik olarak (bir servis katmanı olarak) new'leme işlemi
        // bu sınıf bir business nesnesidir.
public class LanguagesManager implements LanguagesService {

	private LanguagesRepository languageRepository; // LanguagesManager dataAccess'den gelen kodları kullanır.
	                                                // dataAcces de LanguagesRepository'yi kullanır.
	
	@Autowired // yeni versiyonlarda gerek yok
	public LanguagesManager(LanguagesRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
														
	
	
	@Override
	public List<ProgrammingLanguages> getAll() {
		// İş kuralları
		return languageRepository.getAll();
	}

}
