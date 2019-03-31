package util;

import dto.PersonDTO;
import entity.Address;
import entity.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Util {
    private List<String> names = new ArrayList<>();
    private List<String> countries = new ArrayList<>();
    private List<String> cities = new ArrayList<>();

    {
        names.add("Max");
        names.add("Elena");
        names.add("Paul");
        names.add("Steve");
        names.add("Kate");

        countries.add("Russia");
        countries.add("USA");
        countries.add("Australia");
        countries.add("Japan");
        countries.add("China");

        cities.add("Moscow");
        cities.add("New York");
        cities.add("Sydney");
        cities.add("Tokyo");
        cities.add("Beijing");
    }

    public int getRandomInt() {
        return (int) (Math.random() * 100);
    }

    public String getRandomName() {
        return names.get((int) (Math.random() * (names.size())));
    }

    public String getRandomCountry() {
        return countries.get((int) (Math.random() * (countries.size())));
    }

    public String getRandomCity() {
        return cities.get((int) (Math.random() * (cities.size())));
    }

    public LocalDate getRandomDate() {
        return LocalDate.of(1940 + (int) (Math.random() * 60),
                1 + (int) (Math.random() * 12),
                1 + (int) (Math.random()) * 28);
    }

    public Person initRandomPerson() {
        return new Person(getRandomInt(),
                getRandomName(),
                getRandomDate(),
                new Address(getRandomCountry(), getRandomCity(), "Street", "house")
        );
    }

    public PersonDTO initRandomPersonDTO() {
        return new PersonDTO(getRandomInt(),
                getRandomName(),
                getRandomDate(),
                new Address("Country", "City", "Street", "house")
        );
    }
}
