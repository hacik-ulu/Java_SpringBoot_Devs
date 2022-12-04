package Kodlama.io.Devs.Devs.dataAcces.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.Devs.entitites.concretes.ProgrammingLanguages;

public interface LanguagesRepository {

	List<ProgrammingLanguages> getAll(); // getAll() çağırıldığında programlama dilleri listelenir.
	
	ProgrammingLanguages getById(int id) throws Exception;
	void addLanguages(ProgrammingLanguages programmingLanguages, String newProgrammingLanguagesName) throws Exception;
	void updateLanguage(ProgrammingLanguages programmingLanguages, int id) throws Exception;
	void deleteLanguage(int id) throws Exception;


}
