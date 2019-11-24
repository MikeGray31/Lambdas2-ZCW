import org.junit.Test;

public class LocalClassTest {

    @Test
    public void AgeTestTest(){
        People people = new People();
        CheckPerson checkThis = (Person p) -> {
            if(p.age >= 21){
                return true;
            }
            return false;
        };
        People.printPersons(people.personList, checkThis);
    }

}
