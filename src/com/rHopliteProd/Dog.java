package com.rHopliteProd;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int size, int body, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brain, size, body, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() method called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk() method called");
        super.move(4);
    }

    public void run(){
        System.out.println("Dog.run() method called");
        move(7);
    }
    public void moveLegs(){
        System.out.println("Dog.moveLegs() method called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() method called");
        moveLegs();
        super.move(speed);
    }
}
