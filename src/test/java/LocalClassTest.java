import org.junit.Test;

public class LocalClassTest {

    @Test
    public void AgeTestTest(){
        People people = new People();
        People.printPersons(people.personList, new AgeTest());
    }

}
