package Ch_09.problem08;

public class Fan {
    public static final int SLOW=1;
    public static final int Medium=2;
    public static final int Fast=3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius =5;
        color ="blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(isOn()){
            return "Fan{ speed: "+getSpeed()+", radius: "+getRadius()+", color: "+getColor()+"}";
        }else {
            return "Fan{ fan is off , radius: "+getRadius()+", color: "+getColor()+"}";
        }
    }
}
