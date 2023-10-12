package Ch_09.problem08;

public class Main {
    public static void main(String[] args) {
        Fan f1=new Fan();
        f1.setColor("yellow");
        f1.setSpeed(Fan.Fast);
        f1.setOn(true);
        f1.setRadius(10);

        Fan f2=new Fan();
        f2.setColor("blue");
        f2.setSpeed(Fan.Medium);
        f2.setOn(false);
        f2.setRadius(5);

        System.out.println(f1);
        System.out.println(f2);

    }
}
