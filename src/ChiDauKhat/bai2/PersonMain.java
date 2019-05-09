package ChiDauKhat.bai2;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Chi Dau Khat", "Dong Da",19,"0905378083");
        Person person1 = new Person("Loc Can","Sydney",19,"0333353974");
        Person person2 = new Person("Thuy Duonng","Xi Gon",19,"ib Lee Chan Yin for her number phone");
        /*
        bài 3 tương tự chỉ cần tạo ra như ri xong làm y chang bên dưới đổi biến là ra
         */
        float average = (person.getAge() + person1.getAge() + person2.getAge())/3;
        System.out.println("Average Age: "+ average);
    }
}
