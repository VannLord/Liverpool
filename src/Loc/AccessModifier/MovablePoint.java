package Loc.AccessModifier;

public class MovablePoint extends Point{
    float xSpeed=0.0f;
    float ySpeed=0.0f;
    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(){}
    public MovablePoint(float xSpeed,float ySpeed)
    {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{"+super.toString() +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public MovablePoint move(){
        x+=xSpeed;
        y+=ySpeed;
        return this;
    }
}
