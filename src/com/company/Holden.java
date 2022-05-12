package com.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden --> Starting engine ...";
    }

    @Override
    public String accelerate() {
        return "Holden --> Accelerating ... ";
    }

    @Override
    public String brake() {
        return "Holden --> Braking ...";
    }
}
