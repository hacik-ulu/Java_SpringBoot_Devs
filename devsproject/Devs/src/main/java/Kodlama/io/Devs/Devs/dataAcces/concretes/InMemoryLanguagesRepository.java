package Kodlama.io.Devs.Devs.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.Devs.dataAcces.abstracts.LanguagesRepository;
import Kodlama.io.Devs.Devs.entitites.concretes.ProgrammingLanguages;

@Repository // Bu sınıf bir dataAccess nesnesidir.
public class InMemoryLanguagesRepository implements LanguagesRepository {

	List<ProgrammingLanguages> programmingLanguages;

	public InMemoryLanguagesRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguages>(); // Boş bir liste eklendi.
		programmingLanguages.add(new ProgrammingLanguages("C#", 1)); // Listeye eleman eklendi.
		programmingLanguages.add(new ProgrammingLanguages("Python", 2)); // Listeye eleman eklendi.
		programmingLanguages.add(new ProgrammingLanguages("Java", 3)); // Listeye eleman eklendi.

	}

	@Override
	public List<ProgrammingLanguages> getAll() {
		return programmingLanguages;
	}

	public ProgrammingLanguages getById(int id) throws Exception {
		for (ProgrammingLanguages programmingLanguages : programmingLanguages) {
			if (programmingLanguages.getId() == id) {
				return programmingLanguages;
			}
		}
		throw new Exception("Belirtilen ID numarasi icin herhangi bir kayit bulunamadi.");
	}

	@Override
	public void addLanguages(ProgrammingLanguages programmingLanguages, String newProgrammingLanguagesName)
			throws Exception {

	}

	@Override
	public void updateLanguage(ProgrammingLanguages programmingLanguages, int id) throws Exception {

	}

	@Override
	public void deleteLanguage(int id) throws Exception {

	}

}
