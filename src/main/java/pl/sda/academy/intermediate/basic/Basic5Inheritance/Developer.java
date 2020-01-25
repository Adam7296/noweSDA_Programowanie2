package pl.sda.academy.intermediate.basic.Basic5Inheritance;

public abstract class Developer {

    protected String name;
    protected String company;
    protected double salary;

    public Developer(String name, String company, double salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    abstract void makeCode();
}



