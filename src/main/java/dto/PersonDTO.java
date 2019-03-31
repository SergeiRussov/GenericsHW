package dto;

import entity.Address;

import java.io.Serializable;
import java.time.LocalDate;

public class PersonDTO implements Serializable {
    private int id;
    private String name;
    private LocalDate birthDate;
    private Address address;

    public PersonDTO() {

    }

    public PersonDTO(int id, String name, LocalDate birthDate, Address address) {
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

    @Override
    public String toString() {
        return "[id = " + id +
                "], [name = '" + name + '\'' +
                "], [birthDate = " + birthDate +
                "], [address = " + address +
                ']';
    }
}
