package buoi7;

class Animal
{
    public void MakeSound(){}
}

class Dog extends Animal
{
    @Override
    public void MakeSound()
    {
        System.out.println("GAU GAU");
    }
}

class Bird extends Animal {
    @Override
    public void MakeSound()
    {
        System.out.println("CHIP CHIP");
    }
}

class Pig extends Animal
{
    @Override
    public void MakeSound()
    {
        System.out.println("UN IN");
    }
}

class Cat extends Animal
{
    @Override
    public void MakeSound()
    {
        System.out.println("MEO MEO");
    }
}

