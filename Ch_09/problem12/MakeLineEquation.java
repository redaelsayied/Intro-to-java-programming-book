package Ch_09.problem12;

public class MakeLineEquation {
    private double x1,x2;
    private double y1,y2;
    private double a,b,e;


    public MakeLineEquation(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

        setParameters();
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    public double getE() {
        return e;
    }
    public void setParameters(){
        a=y1-y2;
        b=-(x1-x2);
        e=(y1-y2)*x1-(x1-x2)*y1;
    }
}
