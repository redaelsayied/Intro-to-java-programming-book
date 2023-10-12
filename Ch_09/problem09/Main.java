package Ch_09.problem09;

public class Main {
    public static void main(String[] args) {
        RegularPolygon r1=new RegularPolygon();
        RegularPolygon r2=new RegularPolygon(6 ,4);
        RegularPolygon r3=new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("First: area is : "+r1.getArea()+
                ", and perimeter "+r1.getPerimeter());

        System.out.println("Second: area is : "+r2.getArea()+
                ", and perimeter "+r2.getPerimeter());

        System.out.println("Third: area is : "+r3.getArea()+
                ", and perimeter "+r3.getPerimeter());
    }
}
