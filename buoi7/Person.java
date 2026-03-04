package buoi7;

import java.util.Date;

public class Person {
    public String name;
    public Date birthday;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDate(Date birthday)
    {
        this.birthday = birthday;
    }

    public String getDetails()
    {
        return "Name: "+name+" - "+"Birthday"+birthday;
    }
}

class Employee extends Person
{
    public double salary;

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public String getDetails()
    {
        return super.getDetails() + " - " + " Salary " + salary;
    }
}

class Manager extends Employee
{
    private Employee assistant;

    public void setAssistant(Employee assistant)
    {
        this.assistant = assistant;
    }

    @Override
    public String getDetails()
    {
        return super.getDetails() + " - " + " Employee Assistant " + assistant;
    }
}
