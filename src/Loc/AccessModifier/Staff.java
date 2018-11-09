package Loc.AccessModifier;

public class Staff extends Person{
    String school;
    double pay;
    public Staff(){}

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public Staff(String name, String address, String school, double pay)
    {
        super(name, address);
        this.pay=pay;
        this.school=school;
    }

    @Override
    public String toString() {
        return "Staff{"+super.toString() +
                "school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}
