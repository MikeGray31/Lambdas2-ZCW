import java.time.LocalDate;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    int age;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return this.age;
    }

    public void printPerson() {
        System.out.println("Name: " + this.name);
        System.out.println("     gender: " + this.gender);
        System.out.println("     age: " + this.age);
        System.out.println("     Birthday: " + this.birthday);
        System.out.println("     email: " + this.emailAddress);
    }
}
