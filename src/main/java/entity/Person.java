package entity;

import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private LocalDate birthDate;
    private Address address;


    public Person(int id, String name, LocalDate birthDate, Address address) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
