public class Circle
{
    private double radius = 1.0;
    private String color = "red";

    @Override 
    public String toString()
    {
        return "rad:"+Double.toString(radius) + " col:"+color;
    }

    public Circle(){}

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }

    public double GetRadius()
    {
        return this.radius;
    }

    public void SetRadius(double rad)
    {
        this.radius = rad;
    }

    public String GetColor()
    {
        return this.color;
    }

    public void SetColor(String col)
    {
        this.color = col;
    }

    public double GetAreaDouble()
    {
        return (this.radius)*(this.radius)*3.14;
    }

    public void display()
    {
        System.out.println(this.toString());
        System.out.println("Area: " + Double.toString(this.GetAreaDouble()));
    }

    public static void Main(String[] args) {
        Circle cir = new Circle(2.0, "blue");
        cir.display();
    }
}