package Ch_09.problem10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double  getDiscriminant(){
        return Math.pow(getB(),2)-4*getA()*getC();
    }
    public double getRoot1(){
        if(getDiscriminant()>=0){
            return (-getB()+Math.sqrt(getDiscriminant()))/(2*getA());
        }else return 0;
    }

    public double getRoot2(){
        if(getDiscriminant()>=0){
            return (-getB()-Math.sqrt(getDiscriminant()))/(2*getA());
        }else return 0;
    }
}
