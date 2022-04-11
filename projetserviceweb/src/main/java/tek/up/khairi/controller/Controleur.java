package tek.up.khairi.controller;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tek.up.khairi.dao.PersonDao;
import tek.up.khairi.dao.PersonDaoImpl;
import tek.up.khairi.entities.Person;

@RestController
public class Controleur {
	@Autowired
	PersonDao persondao;
	@PostMapping("/person")
	public Person addPerson(@RequestBody Person p) {return persondao.addPerson(p);}
	@GetMapping("/person")
	public Collection<Person> getAllPerson() {return persondao.getAllPersons();}
	@GetMapping("/person{id}")
	public Person getPersonById(@PathVariable int id) {return persondao.getPersonById(id);}
	@PutMapping("/person")
	public Person updatePerson(@RequestBody Person p) {return persondao.updatePerson(p);}
	@DeleteMapping("/person")
	public Person personne(@RequestBody Person p) {return persondao.deletePerson(p) ;}
}