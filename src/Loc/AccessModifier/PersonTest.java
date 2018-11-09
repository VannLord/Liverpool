package Loc.AccessModifier;

public class PersonTest {
    public static void main(String[] args) {
        Person person= new Person("Loc","Danang");
        Student student = new Student("Loc","Danag","Highschool",1999,5000000);
        Staff staff = new Staff("Loc","danag","DUT",5000000);
        System.out.println(person);
        System.out.println(staff);
        System.out.println(student);
        person= new Person();
        student=new Student();
        staff= new Staff();
        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
    }
}
