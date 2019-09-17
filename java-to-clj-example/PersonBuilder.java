package jug.kaunas;

import java.util.List;
import java.util.ArrayList;

public class PersonBuilder {
    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    private String firstName;
    private String lastName;
    private short age;
    private List<String> hobbies = new ArrayList<>();

    private PersonBuilder(){
    }

    public PersonBuilder withName(String first, String last){
        this.firstName = first;
        this.lastName = last;

        return this;
    }

    public PersonBuilder withAge(short age){
        this.age = age;
        return this;
    }

    public PersonBuilder withHobby(String hobby){
        this.hobbies.add(hobby);
        return this;
    }

    public Person build(){
        return new Person(firstName, lastName, age, hobbies);
    }
}
