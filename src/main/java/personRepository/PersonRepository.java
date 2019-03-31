package personRepository;

import java.util.List;

public interface PersonRepository<T> {
    T getPerson();
    List<T> getAllPersons();
    void addPerson(T t);
    void addAllPersons(List<T> list);
}
