package buoi7;

public abstract class Bank {
    public abstract double LaiSuat();
    public void ToString()
    {
        System.out.println("Lai suat: "+this.LaiSuat());
    }
}

class SBI extends Bank
{
    @Override
    public double LaiSuat(){return 8.0;}
}

class ICIC extends Bank
{
    @Override
    public double LaiSuat(){return 7.0;}
}

class AXIS extends Bank
{
    @Override
    public double LaiSuat(){return 9.0;}
}