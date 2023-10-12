package Ch_09.problem11;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;


    public LinearEquation(double a, double b, double c, double d,
                          double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getX() {
        if(isSolved()){
            return (e*d-b*f)/(a*d-b*c);
        }
        return 0;
    }

    public double getY() {
        if(isSolved()){
            return (a*f-e*c)/(a*d-b*c);
        }
        return 0;
    }



    public boolean isSolved(){
        return (a*d-b*c)!=0;
    }
}
