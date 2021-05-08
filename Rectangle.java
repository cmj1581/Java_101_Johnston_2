public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
      length = 0;
      width = 0;
    }

    public void setLength(double a) {
      this.length = a;
    }
    public void setWidth(double n) {
      this.width = n;
    }

    public double getLength() { return length; }
    
    public double getWidth() { return width; }

    public double getArea() { return length * width; } 
    


}