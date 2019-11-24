import java.util.ArrayList;
import java.util.List;

public class People {

    List<Person> personList = new ArrayList<>();

    public People(){
        personList.add(new Person("Mike", 23));
        personList.add(new Person("Mike2", 22));
        personList.add(new Person("Mike3", 21));
        personList.add(new Person("Mike4", 20));
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}
