package сonverter.impl;

import dto.PersonDTO;
import entity.Address;
import entity.Person;
import сonverter.Converter;

public class PersonDTOToPerson implements Converter<PersonDTO, Person> {
    @Override
    public Person convert(PersonDTO personDTO) {
        return new Person(personDTO.getId(),
                personDTO.getName(),
                personDTO.getBirthDate(),
                new Address(personDTO.getAddress().getCountry(),
                        personDTO.getAddress().getCity(),
                        personDTO.getAddress().getStreet(),
                        personDTO.getAddress().getHouse()));
    }
}
