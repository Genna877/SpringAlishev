package ru.tokarev.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.tokarev.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;

    private List<Person> people;

//    --------------  Наша БАЗА  --------------------  //

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT,"name"));
        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "Tom"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void delete(Person person){
        people.remove(person);
    }
}
