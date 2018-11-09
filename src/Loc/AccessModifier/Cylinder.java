package Loc.AccessModifier;

public class Cylinder extends Circle {
    private double height=1;

    public Cylinder(double height,double radius, String color)
    {
        super(radius,color);
        this.height=height;
    }
    public double getHeigth() {
        return height;
    }

    public void setHeigth(double heigth) {
        this.height = heigth;
    }
    public double volume (){
        return super.getArea()*height;
    }
    public Cylinder(Cylinder cylinder){
        this.height=cylinder.getHeigth();



    }



    @Override
    public String toString() {
        return "Cylinder{" +super.toString()+
                "height=" + height +
                '}';
    }
}
