
public class AgeTest implements CheckPerson {

    @Override
    public Boolean test(Person p) {
        if(p.age > 21){
            return true;
        }
        return false;
    }
}
