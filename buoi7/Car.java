package buoi7;

public class Car {
    public void move(){}
}

class Ford extends Car
{
    @Override
    public void move()
    {
        System.out.println("Ford");
    }
}

class Honda extends Car
{
    @Override
    public void move()
    {
        System.out.println("Honda");
    }
}

class LandRover extends Car
{
    @Override
    public void move()
    {
        System.out.println("LandRover");
    }
}