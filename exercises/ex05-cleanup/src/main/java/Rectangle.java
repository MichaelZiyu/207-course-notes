//This file defines a Rectangle class to represent a rectangle.


public class Rectangle {
    //Rectangle class represents a rectangle, with some methods giving more ways to describe this rectangle
    // Attributes:
        // private double width: the width of the rectangle
        // private double height: the height of the rectangle


    private double width;
    private double height;

    //initialize the rectangle by its width and height
    // @param w, h
    public Rectangle(double w,double h){
        this.width=w;
        this.height=h;
    }


    public double area(){
        return width*height;
    }

    /**
     * scales the rectangle
     * @param factor
     */
    public void scale(double factor) {
      width = width * factor;
      height = height * factor;
    }

    /**
     * compare the rectangle with another rectangle by areas
     * @param other
     */
    public boolean isLargerThan(Rectangle other){
        if(area() > other.area())
            return true;
        else
            return false;
    }
}
