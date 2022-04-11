package tek.up.khairi.dao;

import java.util.Collection;
import java.util.Hashtable;
import org.springframework.stereotype.Component;
import tek.up.khairi.entities.Person;

@Component
public class PersonDaoImpl implements PersonDao{
	Hashtable<Integer,Person> persons=new Hashtable<Integer,Person>();
	@Override
	public Collection<Person> getAllPersons() {
		return persons.values();}
	@Override
	public Person getPersonById(int id) {
		return persons.get(id);}
	@Override
	public Person addPerson(Person p) {
		persons.put(p.getId(), p);
		return p;}
	@Override
	public Person updatePerson(Person p) {
		persons.put(p.getId(), p);
		return p;}
	@Override
	public Person deletePerson(Person p) {
		persons.remove(p.getId());
		return p;}
}
