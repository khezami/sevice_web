package tek.up.khairi.dao;

import java.util.Collection;

import tek.up.khairi.entities.Person;

public interface PersonDao {
	
public Collection<Person> getAllPersons();

public Person getPersonById(int id);
public Person addPerson(Person p);
public Person updatePerson(Person p);
public Person deletePerson(Person p);

}
