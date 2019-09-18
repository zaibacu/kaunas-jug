package jug.kaunas;

import java.util.List;

public class Person {
    private final String firstName;
    private final String lastName;
    private short age;
    private List<String> hobbies;
    

    public Person(String firstName, String lastName, short age, List<String> hobbies){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hobbies = hobbies;
    }

    public void greet(){
        System.out.printf("Hello, %s\n", getName());
    }

    public void printHobbies(){
        System.out.printf("%s hobbies: \n", getName());
        for(String hobby : hobbies){
            System.out.println(hobby);
        }
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    @Override
    public String toString(){
        return String.format("<Person firstName: '%s' lastName: '%s' age: '%d'>", firstName, lastName, age);
    }
}
