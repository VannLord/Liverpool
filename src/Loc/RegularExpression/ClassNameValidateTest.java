package Loc.RegularExpression;

public class ClassNameValidateTest {
    private static ClassNameValidate classNameValidate;
    public static final String[] validName = {"C0318G","A0704L","P1111H"};
    public static final String[] invalidName = {"M0318G","P0323A"};

    public static void main(String[] args){
        ClassNameValidate sdf=new ClassNameValidate();
    classNameValidate = new ClassNameValidate();
        for (String name : validName
             ) {
            boolean check = classNameValidate.validate(name);
            System.out.println("Class name "+name+" is valid ? "+check);
        }
        for (String name : invalidName
        ) {
            boolean check = classNameValidate.validate(name);
            System.out.println("Class name "+name+" is valid ? "+check);
        }

    }
}
