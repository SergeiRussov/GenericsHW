package entity;

import java.io.Serializable;

public class Address implements Serializable {
    private String country;
    private String city;
    private String street;
    private String house;

    public Address() {

    }

    @Override
    public String toString() {
        return "{country = '" + country + '\'' +
                ", city = '" + city + '\'' +
                ", street = '" + street + '\'' +
                ", house = '" + house + '\'' + '}';
    }

    public Address(String country, String city, String street, String house) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }
}
