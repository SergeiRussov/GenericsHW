package сonverter.impl;

import dto.PersonDTO;
import entity.Address;
import entity.Person;
import сonverter.Converter;

public class PersonToPersonDTO implements Converter<Person, PersonDTO> {

    @Override
    public PersonDTO convert(Person person) {
        return new PersonDTO(person.getId(),
                person.getName(),
                person.getBirthDate(),
                new Address(person.getAddress().getCountry(),
                        person.getAddress().getCity(),
                        person.getAddress().getStreet(),
                        person.getAddress().getHouse()));
    }
}
