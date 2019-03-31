package service.impl;

import dto.PersonDTO;
import entity.Person;
import personRepository.impl.PersonRepositoryImpl;
import service.Service;
import сonverter.impl.PersonDTOToPerson;
import сonverter.impl.PersonToPersonDTO;

import java.util.ArrayList;
import java.util.List;

public class PersonService implements Service<PersonDTO> {
    PersonRepositoryImpl personRepository = new PersonRepositoryImpl();
    PersonToPersonDTO personToPersonDTO = new PersonToPersonDTO();
    PersonDTOToPerson personDTOToPerson = new PersonDTOToPerson();

    @Override
    public PersonDTO getPerson() {
        return personToPersonDTO.convert(personRepository.getPerson());
    }

    @Override
    public List<PersonDTO> getAllPersons() {
        List<PersonDTO> list = new ArrayList<>();

        for (Person person : personRepository.getAllPersons()) {
            list.add(personToPersonDTO.convert(person));
        }

        return list;
    }

    @Override
    public void addPerson(PersonDTO personDTO) {
        personRepository.addPerson(personDTOToPerson.convert(personDTO));
    }

    @Override
    public void addAllPersons(List<PersonDTO> list) {
        List<Person> personList = new ArrayList<>();

        for (PersonDTO personDTO : list) {
            personList.add(personDTOToPerson.convert(personDTO));
        }

        personRepository.addAllPersons(personList);
    }
}
