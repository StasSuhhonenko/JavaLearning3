package com.rHopliteProd;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, size, 1, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){
        System.out.println("method Fish.rest called");
    }

    private void moveMuscles(){
        System.out.println("method Fish.moveMuscles called");
    }

    private void moveBackFin(){
        System.out.println("Method Fish.moveBackFin called");
    }
    private void swim( int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
