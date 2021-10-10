package com.rHopliteProd;

public class Point {
    private int x;
    private int y;

    public Point(){
        this(0,0);
        System.out.println("Default constructor");
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return Math.sqrt((getX()*getX()) +(getY()* getY()));
    }
    public double distance(int x, int y){
        return Math.sqrt((x - getX())*(x- getX())+(y - getY())*(y -getY()));
    }
    public double distance(Point another){
        int x = another.x;
        int y = another.y;
        return Math.sqrt((x - getX())*(x- getX())+(y - getY())*(y -getY()));
    }
}
