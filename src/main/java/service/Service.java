package service;

import java.util.List;

public interface Service<T> {
    T getPerson();
    List<T> getAllPersons();
    void addPerson(T t);
    void addAllPersons(List<T> list);
}
