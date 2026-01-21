public class Rectangle {

    private int length = 1;
    private int width = 1;

   
    public Rectangle() {}
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public int getLength() {
        return length;
    }

     public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return this.length * this.width;
    }

    public String toString() {
        return "Length: " + Integer.toString(length) + " Width: " + Integer.toString(width);
    }

    public void display() {
        System.out.println(this.toString());
        System.out.println("Area: " + Integer.toString(this.getArea()));
    }
}
