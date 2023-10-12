package Ch_09.problem01;

//UML Class Diagram
/**************************************************
 *               Rectangle                         *
 * ------------------------------------------------*
 * width: double                                   *
 * height: double                                  *
 * Rectangle()                                     *
 * Rectangle(width: double, height: double)  *
 * getArea(): double                               *
 * getPerimeter(): double                          *
 ***************************************************/


public class Rectangle {
    double width;
    double height;

    public Rectangle(){
        width=1;
        height=1;
    }

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*(width+height);
    }
}
