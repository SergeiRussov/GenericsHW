import dto.PersonDTO;
import service.impl.PersonService;
import util.Util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        List<PersonDTO> personDTOList = personService.getAllPersons();

        System.out.println("Добавляем список пользователей в репозиторий:");
        personService.addAllPersons(personDTOList);

        System.out.println("\nВыводим содержимое репозитория на экран:");
        for (PersonDTO personDTO : personDTOList) {
            System.out.println(personDTO.toString());
        }

        System.out.println("\nСортируем репозиторий по полю id:");
        Collections.sort(personDTOList, Comparator.comparing(PersonDTO::getId));
        for (PersonDTO personDTO : personDTOList) {
            System.out.println(personDTO.toString());
        }

        System.out.println("\nСортируем репозиторий по дате рождения в обратном порядке:");
        Collections.sort(personDTOList, Comparator.comparing(PersonDTO::getBirthDate).reversed());
        for (PersonDTO personDTO : personDTOList) {
            System.out.println(personDTO.toString());
        }

        System.out.println("\nСортируем репозиторий по полю address(поля country и city):");
        Comparator<PersonDTO> comparator = Comparator.comparing(country -> country.getAddress().getCountry());
        Collections.sort(personDTOList, comparator.thenComparing(city -> city.getAddress().getCity()));
        for (PersonDTO personDTO : personDTOList) {
            System.out.println(personDTO.toString());
        }
    }
}
