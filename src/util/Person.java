package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

    private String name;
    private int height;
    private double salary;
    private String gender;
    private int kids;
    List<String> hobbies = new ArrayList<>();

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public int getKids() {
        return kids;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public Person(String name, int height, double salary, String gender, int kids, List<String> hobbies) {
        this.name = name;
        this.height = height;
        this.salary = salary;
        this.gender = gender;
        this.kids = kids;
        this.hobbies = hobbies;
    }

    public static List<Person> getAllPerson(){
        Person p1 = new Person("Aravind",175,100000.0,"male",2, Arrays.asList("Cricket","Volley ball"));
        Person p2 = new Person("Santhiya",125,60000.0,"female",2, Arrays.asList("Coc","CR"));
        Person p3 = new Person("Puppy",135,80000.0,"female",2, Arrays.asList("Study","Learn"));
        Person p4 = new Person("Arun",185,90000.0,"male",2, Arrays.asList("Cricket","Foot ball"));
        Person p5 = new Person("Ragul",175,80000.0,"male",2, Arrays.asList("Cricket","CR"));

        return Arrays.asList(p1,p2,p3,p4,p5);
    }
}
