package personRepository.impl;

import entity.Person;
import personRepository.PersonRepository;
import util.Util;

import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryImpl implements PersonRepository<Person> {
    private Util util = new Util();

    @Override
    public Person getPerson() {
        return util.initRandomPerson();
    }

    @Override
    public List<Person> getAllPersons() {
        return new ArrayList<Person>(){{
            for (int i = 0; i < (int) (Math.random() * 50); i++) {
                add(util.initRandomPerson());
            }
        }};
    }

    @Override
    public void addPerson(Person person) {
        System.out.println(person.getId() + " " + person.getName() + " " + person.getBirthDate() + " "
                + person.getAddress());
    }

    @Override
    public void addAllPersons(List<Person> list) {
        for (Person person : list) {
            addPerson(person);
        }
    }
}
