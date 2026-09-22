//This file defines a Rectangle class to represent a rectangle.

/**
 * Rectangle class represents a rectangle, with some methods helping to describe the this rectangle
 * Attributes:
 *  private double width: the width of the rectangle
 *  private double height: the height of the rectangle
 */
public class Rectangle {
  private double width;
  private double height;

    /**initialize the rectangle by its width and height
    * @param w: width
    * @param h: height
    */
  public Rectangle(double w,double h){
        this.width=w;
        this.height=h;
  }


    /** calculate and return width times height
     *
     * @return width times height
     */
  public double area(){
        return width*height;
  }

    /**
     * scales the rectangle
     * @param factor scalling factor
     */
  public void scale(double factor) {
      width = width * factor;
      height = height * factor;
  }

    /**
     * compare the rectangle with another rectangle by areas
     * @param item another rectangle
     */
  public boolean isLargerThan(Rectangle item){
        if(area() > item.area())
            return true;
        else
            return false;
  }
}
